package app.willywonkar2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.willywonkar2.model.User;
import app.willywonkar2.repository.RepositoryUser;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@Service
public class ServiceUser {  
      
    @Autowired
    private RepositoryUser repository;
 
    public List<User> listUsers(){
        return repository.listUsers();
    }

}
