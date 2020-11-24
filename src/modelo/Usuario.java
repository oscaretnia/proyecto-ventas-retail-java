
package modelo;


public class Usuario {
    
    private String nombre;
    private String apellidos;
    private String cargo;
    private String usuario;
    private String email;
    private String clave;

    public Usuario(String nombre, String apellidos, String cargo, String usuario, String email, String clave) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.usuario = usuario;
        this.email = email;
        this.clave = clave;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
