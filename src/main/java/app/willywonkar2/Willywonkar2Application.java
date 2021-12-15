package app.willywonkar2;

import app.willywonkar2.Interface.InterfaceChocolate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.willywonkar2.Interface.InterfaceUser;
import app.willywonkar2.model.User;

//import app.willywonkar2.model.User;
//import java.util.List;
//import java.util.Optional;
@SpringBootApplication
public class Willywonkar2Application implements CommandLineRunner {

    @Autowired
    private InterfaceUser interfaceUser;
    @Autowired
    private InterfaceChocolate interfaceChocolate;

    public static void main(String[] args) {
        SpringApplication.run(Willywonkar2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        interfaceUser.deleteAll();
        interfaceChocolate.deleteAll();
    }
}
