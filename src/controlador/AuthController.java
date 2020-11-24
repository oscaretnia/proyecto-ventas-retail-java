
package controlador;

import modelo.AuthService;
import modelo.User;
import vistas.SignView;


public class AuthController {
    
    private final AuthService model;
    private final SignView view;
    
    //Inyectar la vista en el constructor
    public AuthController(SignView vista) {
        model = new AuthService();
        this.view = vista;
    }
    
    public void iniciarSesion(String username, String password) {
        User user = model.validarUsuario(username, password);
        
        response(user, "No se pudo inicar sesión!");
        
    }
    
    public void registrarUsuario(String name, String lastname, String position, String username, String email, String password) {
        User user = model.registerUser(name, lastname, position, username, email, password);
        
        response(user, "No se pudo registrar el usuario!");
    }
    
    public void response(User user, String message) {
        if (user != null) {
            view.onSuccess(user);
        } else {
            view.onError(message);
        }
    }
    
}
