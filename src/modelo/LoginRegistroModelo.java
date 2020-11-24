
package modelo;

import java.util.List;


public class LoginRegistroModelo {
    
    Datos db = new Datos();
    
    public Usuario validarUsuario(String username, String password) {
        
        List<Usuario> usuarios = db.get();
        
        for (Usuario usuario : usuarios) {
            if (usuario.getUsuario().equals(username)) {                
                if (usuario.getClave().equals(password)) {
                    return usuario;
                } else {
                    System.out.println("Error clave invalido");
                    return null;
                }                
            } else {
                System.out.println("Error usuario invalido");
                return null;
            }
        }
        return null;
    }
    
    public Usuario registrarUsuario(String nombre, String apellidos, String cargo, String username, String email, String password) {
        Usuario usuario = new Usuario(nombre, apellidos, cargo, username, email, password);
        db.add(usuario);
        return usuario;
    }
    
}
