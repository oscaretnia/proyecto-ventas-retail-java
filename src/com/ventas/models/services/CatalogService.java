/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.models.services;

import com.ventas.models.db.Data;
import com.ventas.models.entities.Product;
import com.ventas.models.entities.Sale;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oscaretnia
 */
public class CatalogService {
    
    Data db = Data.getInstance();
    
    public void makeSale(String prod, int quantity, String date) {
        Product product = db.getProducts().stream().filter(p -> p.getName().equals(prod)).collect(Collectors.toCollection(LinkedList::new)).getFirst();
        db.addSale(new Sale(product, quantity, date));
    }
    
    public List<Product> getProductsByCategory(String category) {
        return db.getProducts().stream().filter(p -> p.getCategory().equals(category)).collect(Collectors.toCollection(LinkedList::new));
    }
    
}
