/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.models.entities;

/**
 *
 * @author oscaretnia
 */
public class Sale {
    
    private Product product;
    private int quantity;
    private String date;

    public Sale(Product product, int quantity, String date) {
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public int getTotal() {
        return product.getPrice() * quantity;
    }
    
    
    
}
