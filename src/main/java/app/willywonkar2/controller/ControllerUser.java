package app.willywonkar2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import app.willywonkar2.service.ServiceUser;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@RestController
public class ControllerUser {
    @Autowired
    private ServiceUser service;

}
