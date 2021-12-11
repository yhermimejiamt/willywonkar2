package app.willywonkar2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.willywonkar2.repository.RepositoryUser;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@Service
public class ServiceUser {    
    @Autowired
    private RepositoryUser repository;
}
