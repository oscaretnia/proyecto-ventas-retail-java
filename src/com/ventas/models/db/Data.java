
package com.ventas.models.db;

import com.ventas.models.entities.Delivery;
import com.ventas.models.entities.Product;
import com.ventas.models.entities.Sale;
import com.ventas.models.entities.Shipment;
import com.ventas.models.entities.User;
import java.util.LinkedList;
import java.util.List;


public class Data {
    
    private static Data instance;
    
    List<User> users;
    List<Product> products;
    List<Sale> sales;
    List<Delivery> deliveries;
    List<Shipment> shipments;
    
    private Data() {
        users = new LinkedList<>();
        products = new LinkedList<>();
        sales = new LinkedList<>();
        deliveries = new LinkedList<>();
        shipments = new LinkedList<>();
        
        setDummyData();        
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public void addUser(User user) {
        this.users.add(user);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
    
    public List<Sale> getSales() {
        return sales;
    }
    
    public void addSale(Sale sale) {
        this.sales.add(sale);
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public void addDelivery(Delivery delivery) {
        this.deliveries.add(delivery);
    }
    
    public List<Shipment> getShipments() {
        return shipments;
    }

    public void addShipment(Shipment shipment) {
        this.shipments.add(shipment);
    }
            
    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
    
    private void setDummyData() {
        
        Product p1 = new Product("Producto 1", "Hombres", "Producto 1", 10, 1000);
        Product p2 = new Product("Producto 2", "Accesorios", "Producto 2", 10, 1000);
        Product p3 = new Product("Producto 2", "Zapatos", "Producto 2", 10, 1000);
        
        products.add(p1);
        products.add(p2);
        products.add(p3);
        
        sales.add(new Sale(p1, 12, "2020-02-11"));
        sales.add(new Sale(p2, 9, "2020-02-11"));
        
        users.add(new User("Sophy", "Rico", "Administrador", "1994-Febrero-11", "Femenino", "sophyrico", "sophyrico@mail.com", "12345678"));
        users.add(new User("Oscar", "Sepulveda", "Cliente", "1994-Febrero-11", "Masculino", "oscaretnia", "oscaretnia@mail.com", "12345678"));
    }
    
}
