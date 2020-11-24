
package modelo;

import java.util.LinkedList;
import java.util.List;


public class Datos {
    
    List<Usuario> usuarios;
    
    public Datos() {
        usuarios = new LinkedList<>();
    }
    
    public List<Usuario> get() {
        return this.usuarios;
    }
    
    public void add(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    
}
