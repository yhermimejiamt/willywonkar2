package app.willywonkar2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.willywonkar2.model.User;
import app.willywonkar2.repository.RepositoryUser;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@Service
public class ServiceUser {

    @Autowired
    private RepositoryUser repository;

    public List<User> getAll() {
        return repository.getAll();
    }

    public Optional<User> getUser(@PathVariable("id") int id) {
        return repository.getUser(id);
    }

    public boolean emailExist(String email) {
        return repository.emailExist(email);
    }

    public User authenticateUser(String email, String password) {
        Optional<User> usuario = repository.authenticateUser(email, password);

        if (usuario.isEmpty()) {
            return new User();
        } else {
            return usuario.get();
        }
    }

    public User createUser(User user) {

        if (user.getId() == null) {
            return user;
        } else {
            Optional<User> optionUser = repository.getUser(user.getId());
            if (optionUser.isEmpty()) {
                if (emailExist(user.getEmail()) == false) {
                    return repository.createUser(user);
                } else {
                    return user;
                }
            } else {
                return user;
            }
        }
    }

    public User updateUser(User user) {

        if (user.getId() != null) {
            Optional<User> optionUser = repository.getUser(user.getId());
            if (!optionUser.isEmpty()) {
                if (user.getIdentification() != null) {
                    optionUser.get().setIdentification(user.getIdentification());
                }
                if (user.getName() != null) {
                    optionUser.get().setName(user.getName());
                }
                if (user.getAddress() != null) {
                    optionUser.get().setAddress(user.getAddress());
                }
                if (user.getCellPhone() != null) {
                    optionUser.get().setCellPhone(user.getCellPhone());
                }
                if (user.getEmail() != null) {
                    optionUser.get().setEmail(user.getEmail());
                }
                if (user.getPassword() != null) {
                    optionUser.get().setPassword(user.getPassword());
                }
                if (user.getZone() != null) {
                    optionUser.get().setZone(user.getZone());
                }
                if (user.getType() != null) {
                    optionUser.get().setType(user.getType());
                }
                repository.updateUser(optionUser.get());
                return optionUser.get();
            } else {
                return user;
            }
        } else {
            return user;
        }
    }

    public boolean deleteUser(int id) {
        Boolean result = getUser(id).map(user -> {
            repository.deleteUser(user);
            return true;
        }).orElse(false);
        return result;
    }

}
