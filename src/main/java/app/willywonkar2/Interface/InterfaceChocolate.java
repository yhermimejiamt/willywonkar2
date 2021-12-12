package app.willywonkar2.Interface;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.willywonkar2.model.Chocolate;

public interface InterfaceChocolate extends MongoRepository<Chocolate,String>{
    
}
