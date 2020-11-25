/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.controllers;

import com.ventas.models.services.CatalogService;
import com.ventas.views.catalog.CatalogView;
import java.util.Date;

/**
 *
 * @author Pony
 */
public class CatalogController {
    
    private final CatalogService model;
    private final CatalogView view;

    public CatalogController(CatalogView view) {
        this.model = new CatalogService();
        this.view = view;
    }
    
    public void doSale(String product, String qty) {
        int quantity = Integer.parseInt(qty);
        model.makeSale(product, quantity, new Date().toString());
        view.onSuccess();
    }
    
    public void showCatalog(String category) {
        String[] catalog = model.getProductsByCategory(category).stream().map(p -> p.getName()).toArray(String[]::new);
        view.showCatalog(catalog);
    }
    
    
    
}
