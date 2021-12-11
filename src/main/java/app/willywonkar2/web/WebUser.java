package app.willywonkar2.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.willywonkar2.model.User;
import app.willywonkar2.service.ServiceUser;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@RestController
@RequestMapping("/api/user")
public class WebUser {
    
    @Autowired
    private ServiceUser service;

    @GetMapping("/all")
    public List<User> listUsers(){
        return service.listUsers();
    }
}
