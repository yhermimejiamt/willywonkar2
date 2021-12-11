package app.willywonkar2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.willywonkar2.Interface.InterfaceUser;
import app.willywonkar2.model.User;
import java.util.List;
import java.util.Optional;

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
        //interfaceUser.save(new User(2, "80154524", "YHERMI MEJIA", "CALLE 59B 67 13", "3115704652", "yhermi@gmail.com", "123", "ZONA 1", "ADM"));
        /*interfaceUser.saveAll(List.of(
                new User(1, "123456", "alan brito", "CR 34-45", "311222222", "alanbrito@gmail.com", "Demo123.", "ZONA 1", "COORD"),
                new User(2, "5236963", "ANGELOTY", "CR 19 A 63 C 37", "3256323212", "cangalotty@gmail.edu.com",
                        "Demo123.", "ZONA 1", "ADM")));*/
    }
}
