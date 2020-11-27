
package com.ventas.controllers;

import com.ventas.models.services.AuthService;
import com.ventas.models.entities.User;
import com.ventas.views.AdminView;
import com.ventas.views.ClientView;
import com.ventas.views.auth.SignView;


public class AuthController {
    
    private final AuthService model;
    private final SignView view;
    
    //Inyectar la vista en el constructor
    public AuthController(SignView vista) {
        model = new AuthService();
        this.view = vista;
    }
    
    public void signin(String username, String password, String role) {
        User user = model.validUser(username, password, role);
        
        response(user, "No se pudo inicar sesión!");
        
    }
    
    public void signup(String name, String lastname, String position, String birthdate, String gender, String username, String email, String password) {
        User user = model.registerUser(name, lastname, position, birthdate, gender, username, email, password);
        
        response(user, "No se pudo registrar el usuario!");
    }
    
    public void response(User user, String message) {
        if (user != null) {
            if (user.getRole().equals("Cliente")) {
                new ClientView(user.getUsername()).start();
                view.disposes();
            }
            
            if (user.getRole().equals("Administrador")) {
                new AdminView(user.getUsername()).start();
                view.disposes();
            }
            
        } else {
            view.onError(message);
        }
    }
    
}
