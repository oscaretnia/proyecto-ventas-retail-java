
package controlador;

import modelo.LoginRegistroModelo;
import modelo.Usuario;
import vistas.VistaLogin;


public class LoginRegistroControlador {
    
    private final LoginRegistroModelo modelo;
    private final VistaLogin vista;
    
    //Inyectar la vista en el constructor
    public LoginRegistroControlador(VistaLogin vista) {
        modelo = new LoginRegistroModelo();
        this.vista = vista;
    }
    
    public void iniciarSesion(String username, String password) {
        Usuario usuario = modelo.validarUsuario(username, password);
        
        if (usuario != null) {
            vista.onSuccess(usuario);
        } else {
            vista.onError("No se pudo inicar sesión!");
        }
        
    }
    
    public void registrarUsuario(String nombre, String apellidos, String cargo, String username, String email, String password) {
        Usuario usuario = modelo.registrarUsuario(nombre, apellidos, cargo, username, email, password);
        
        //Validar que el usuario no sea nulo
        //Actualizar la vista con el usuario
    }
    
}
