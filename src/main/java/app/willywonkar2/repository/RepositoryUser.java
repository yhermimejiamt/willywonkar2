package app.willywonkar2.repository;

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
}
