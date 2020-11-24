
package modelo;

import java.util.LinkedList;
import java.util.List;


public class Data {
    
    private static Data instance;
    
    List<User> usuarios;
    
    private Data() {
        usuarios = new LinkedList<>();
    }
    
    public List<User> get() {
        return this.usuarios;
    }
    
    public void add(User usuario) {
        this.usuarios.add(usuario);
    }
    
    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
    
}
