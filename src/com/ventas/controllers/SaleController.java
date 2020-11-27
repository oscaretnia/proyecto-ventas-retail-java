/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.controllers;

import com.ventas.models.services.SaleService;
import com.ventas.views.admin.SaleView;
import java.util.Vector;

/**
 *
 * @author oscaretnia
 */
public class SaleController {
    
    private final SaleService model;
    private final SaleView view;
    
    public SaleController(SaleView view) {
        this.view = view;
        model = new SaleService();
    }
    
    public void showSales() {
        Vector<Vector<String>> rows = new Vector<>();
        model.getSales().forEach( sale -> {
            Vector<String> r = new Vector<>();
            r.add(sale.getProduct().getName());
            r.add(String.valueOf(sale.getProduct().getPrice()));
            r.add(String.valueOf(sale.getQuantity()));
            r.add(sale.getDate());
            r.add(String.valueOf(sale.getTotal()));
            rows.add(r);
        });
        view.showSales(rows);
    }
    
}
