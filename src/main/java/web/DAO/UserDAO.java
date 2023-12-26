package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void saveOrUpdateUser(User user);
    User getUserById(Long id);
    void deleteUser(User user);

}
