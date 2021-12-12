package app.willywonkar2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import app.willywonkar2.model.Chocolate;
import app.willywonkar2.repository.RepositoryChocolate;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@Service
public class ServiceChocolate {

    @Autowired
    private RepositoryChocolate repository;

    public List<Chocolate> getAll() {
        return repository.getAll();
    }

    public Optional<Chocolate> getChocolate(@PathVariable("reference") String reference) {
        return repository.getChocolate(reference);
    }

    public Chocolate createChocolate(Chocolate chocolate) {

        if (chocolate.getReference() == null) {
            return chocolate;
        } else {
            return repository.createChocolate(chocolate);
        }
    }

    public Chocolate updateChocolate(Chocolate chocolate) {

        if (chocolate.getReference() != null) {
            Optional<Chocolate> optionChocolate = repository.getChocolate(chocolate.getReference());
            if (!optionChocolate.isEmpty()) {
                if (chocolate.getCategory() != null) {
                    optionChocolate.get().setCategory(chocolate.getCategory());
                }
                if (chocolate.getDescription() != null) {
                    optionChocolate.get().setDescription(chocolate.getDescription());
                }
                if (chocolate.getCategory() != null) {
                    optionChocolate.get().setCategory(chocolate.getCategory());
                }
                if (chocolate.getPrice() != 0.0) {
                    optionChocolate.get().setPrice(chocolate.getPrice());
                }
                if (chocolate.getQuantity() != 0) {
                    optionChocolate.get().setQuantity(chocolate.getQuantity());
                }
                if (chocolate.getPhotography() != null) {
                    optionChocolate.get().setPhotography(chocolate.getPhotography());
                }

                optionChocolate.get().setAvailability(chocolate.isAvailability());
                repository.updateChocolate(chocolate);
                return optionChocolate.get();
            } else {
                return chocolate;
            }
        } else {
            return chocolate;
        }
    }

    public boolean deleteChocolate(String reference) {
        Boolean result = getChocolate(reference).map(chocolate -> {
            repository.deleteChocolate(chocolate);
            return true;
        }).orElse(false);
        return result;
    }
}
