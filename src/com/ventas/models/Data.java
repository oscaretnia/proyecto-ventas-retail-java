
package com.ventas.models;

import java.util.LinkedList;
import java.util.List;


public class Data {
    
    private static Data instance;
    
    List<User> users;
    List<Product> products;
    List<Sale> sales;
    List<Delivery> deliveries;
    
    private Data() {
        users = new LinkedList<>();
        products = new LinkedList<>();
        sales = new LinkedList<>();
        deliveries = new LinkedList<>();
        
        products.add(new Product("Producto 1", "Hombres", "Producto 1", 10, 1000));
        products.add(new Product("Producto 2", "Hombres", "Producto 2", 10, 1000));
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
        System.out.println(deliveries.size());
    }
            
    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
    
}
