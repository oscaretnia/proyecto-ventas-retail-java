/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.models.services;

import com.ventas.models.db.Data;
import com.ventas.models.entities.Sale;
import java.util.List;

/**
 *
 * @author oscaretnia
 */
public class SaleService {
    
    private final Data db = Data.getInstance();
    
    public List<Sale> getSales() {
        return db.getSales();
    }
    
}
