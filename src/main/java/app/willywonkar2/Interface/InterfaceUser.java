package app.willywonkar2.Interface;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import app.willywonkar2.model.User;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@Repository
public interface InterfaceUser extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String Email, String password);

}
