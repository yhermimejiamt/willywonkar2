package app.willywonkar2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.willywonkar2.Interface.InterfaceChocolate;
import app.willywonkar2.model.Chocolate;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@Repository
public class RepositoryChocolate {

    @Autowired
    private InterfaceChocolate interfaceChocolate;

    public List<Chocolate> getAll() {
        return (List<Chocolate>) interfaceChocolate.findAll();
    }

    public Optional<Chocolate> getChocolate(String reference) {
        return interfaceChocolate.findById(reference);
    }

    public Chocolate createChocolate(Chocolate chocolate) {
        return interfaceChocolate.save(chocolate);
    }

    public void updateChocolate(Chocolate chocolate) {
        interfaceChocolate.save(chocolate);
    }

    public void deleteChocolate(Chocolate chocolate) {
        interfaceChocolate.delete(chocolate);
    }

}
