package app.willywonkar2.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.willywonkar2.model.User;
import app.willywonkar2.service.ServiceUser;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author Engineer Yhermi Mejía Sarmiento
 */
@RestController
@RequestMapping("/api/user")
public class WebUser {

    @Autowired
    /**
     * Instansia de la clase ServiceUser
     *
     * @param WebUser in this space start code..
     */
    private ServiceUser service;

    @GetMapping("/all")
    /**
     * Metodo para listar usuarios
     *
     * @param Trae los usuarios que encuentre en la base de datos para listarlos
     *
     * @return Lista de usuarios
     */
    public List<User> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    /**
     * Metodo para identificar un usuario.
     *
     * @param Se utiliza para identificar usuarios.
     *
     * @return el usuario.
     */
    public Optional<User> getUser(@PathVariable("id") int id) {
        return service.getUser(id);
    }

    @PostMapping("/new")
    /**
     * Metodo para crear un usuario.
     *
     * @param Se utiliza para crear usuarios y agregarlos a la base de datos.
     *
     * @return el usuario.
     */
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @PutMapping("/update")
    /**
     * Metodo para actualizar un usuario.
     *
     * @param Se utiliza para actualizar usuarios y agregarlos a la base de datos.
     *
     * @return el usuario.
     */
    @ResponseStatus(HttpStatus.CREATED)
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("/{id}")
    /**
     * Metodo para buscarpor id un usuario.
     *
     * @param Se utiliza para buscar usuarios.
     *
     * @return el usuario.
     */
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteUser(@PathVariable("id") int id) {
        return service.deleteUser(id);
    }

    @GetMapping("/{email}/{password}")
    /**
     * Metodo para validar si existe el correo ingresado en la DB.
     *
     * @param El email que se valida es el del login.
     *
     * @return Si existe en la DB, retorna true, de lo contrario false.
     */
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return service.authenticateUser(email, password);
    }

    @GetMapping("/emailexist/{email}")
    /**
     * Metodo para autenticar el email y la contraseña.
     *
     * @param Se utiliza validar los parametros mencionados y dirigir a la Main,
     * en caso de ser true..
     *
     * @return true or false.
     */
    public boolean emailExists(@PathVariable("email") String email) {
        return service.emailExist(email);
    }

}
