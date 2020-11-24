
package modelo;

import java.util.List;


public class AuthService {
    
    Data db = Data.getInstance();
    
    public User validarUsuario(String username, String password) {
        
        List<User> usuarios = db.get();
        
        for (User usuario : usuarios) {
            if (usuario.getUsername().equals(username)) {                
                if (usuario.getPassword().equals(password)) {
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
    
    public User registerUser(String name, String lastname, String position, String username, String email, String password) {
        User usuario = new User(name, lastname, position, username, email, password);
        db.add(usuario);
        return usuario;
    }
    
}
