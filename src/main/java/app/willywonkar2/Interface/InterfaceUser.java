package app.willywonkar2.Interface;

import org.springframework.data.mongodb.repository.MongoRepository;
import app.willywonkar2.model.User;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */

public interface InterfaceUser extends MongoRepository<User, Integer> {

}
