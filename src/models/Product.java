
package models;


public class Product {
    
    private String nombre;
    private int stock;
    private String descripcion;
    private float precio;

    public Product(String nombre, String descripcion, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public void disminuirStock(int cantidad) {
        this.stock =- cantidad;
    }
    
    public void aumentarStock(int cantidad) {
        this.stock =+ cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
