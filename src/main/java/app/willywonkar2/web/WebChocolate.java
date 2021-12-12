package app.willywonkar2.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import app.willywonkar2.model.Chocolate;
import app.willywonkar2.service.ServiceChocolate;

/**
 * @author Engineer Yhermi Mejía Sarmiento
 */
@RestController
@RequestMapping("/api/chocolate")
public class WebChocolate {

    @Autowired
    private ServiceChocolate service;
       
     @GetMapping("/all")
    public List<Chocolate> getAll() {
        return service.getAll();
    }
    
    @GetMapping("/{reference}")
    public Optional<Chocolate> getChocolate(@PathVariable("reference") String reference) {
        return service.getChocolate(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Chocolate createChocolate(@RequestBody Chocolate gadget) {
        return service.createChocolate(gadget);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Chocolate updateChocolate(@RequestBody Chocolate gadget) {
        return service.updateChocolate(gadget);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteChocolate(@PathVariable("reference") String reference) {
        return service.deleteChocolate(reference);
    } 
}
