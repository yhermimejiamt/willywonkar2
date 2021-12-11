package app.willywonkar2.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.willywonkar2.model.User;
import app.willywonkar2.service.ServiceUser;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@RestController
@RequestMapping("/api/user")
public class WebUser {

    @Autowired
    private ServiceUser service;

    @GetMapping("/all")
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable("id") int id) {
        return service.getUser(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteUser(@PathVariable("id") int id) {
        return service.deleteUser(id);
    }

    @GetMapping("/emailexist/{email}")
    public boolean emailExist(@PathVariable("email") String email) {
        return service.emailExist(email);
    }

    @GetMapping("/{email}/{password}")
    public Optional<User> authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return service.authenticateUser(email, password);
    }
}
