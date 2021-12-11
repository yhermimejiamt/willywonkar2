package app.willywonkar2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.willywonkar2.Interface.InterfaceUser;
import app.willywonkar2.model.User;
import java.util.List;

@SpringBootApplication
public class Willywonkar2Application implements CommandLineRunner {

    @Autowired
    private InterfaceUser interfaceUser;

    public static void main(String[] args) {
        SpringApplication.run(Willywonkar2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        interfaceUser.deleteAll();
        interfaceUser.saveAll(List.of(
                new User(1,"52369563","CARLO ANGELOTY","CR 19 A 63 C 37","3256323212","cangalotty@gmail.edu.com","Demo123.","ZONA 1","ADM"),
                new User(2,"5236963","ANGELOTY","CR 19 A 63 C 37","3256323212","cangalotty@gmail.edu.com","Demo123.","ZONA 1","ADM"),
                new User(3,"5236563","CARLO ANGELOTY","CR 19 A 63 C 37","3256323212","cangalotty@gmail.edu.com","Demo123.","ZONA 1","ADM")
        ));
		System.out.println("Listado");
		interfaceUser.findAll().forEach(System.out::println);
    }

}
