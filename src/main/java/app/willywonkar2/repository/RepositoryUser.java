package app.willywonkar2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.willywonkar2.Interface.InterfaceUser;
import app.willywonkar2.model.User;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@Repository
public class RepositoryUser {

    @Autowired
    private InterfaceUser interfaceUser;

    public List<User> getAll() {
        return (List<User>) interfaceUser.findAll();
    }

    public Optional<User> getUser(int id) {
        return interfaceUser.findById(id);
    }

    public boolean emailExist(String email) {
        Optional<User> user1 = interfaceUser.findByEmail(email);
        return !user1.isEmpty();
    }

    public Optional<User> authenticateUser(String email, String password) {
        return interfaceUser.findByEmailAndPassword(email, password);
    }

    public User createUser(User user) {
        return interfaceUser.save(user);
    }

    public void updateUser(User user) {
        interfaceUser.save(user);
    }

    public void deleteUser(User user) {
        interfaceUser.delete(user);
    }

}
