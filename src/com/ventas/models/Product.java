
package com.ventas.models;


public class Product {
    
    private String name;
    private String category;
    private int stock;
    private String description;
    private int price;

    public Product(String name, String category, String description, int stock, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }
    
    public void plusStock(int stock) {
        this.stock += stock;
    }
    
    public void minusStock(int stock) {
        this.stock -= stock;
    }
    
    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
