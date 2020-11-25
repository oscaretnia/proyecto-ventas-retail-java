/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.models.services;

import com.ventas.models.Data;
import com.ventas.models.Delivery;
import java.util.List;

/**
 *
 * @author oscaretnia
 */
public class DeliveryService {
    
    Data db = Data.getInstance();
    
    public void makeDelivery(String name, String lastname, String address, String home, String methodPayment) {
        db.addDelivery(new Delivery(name, lastname, address, home, methodPayment));
    }
    
    public List<Delivery> getDeliveries() {
        return db.getDeliveries();
    }
    
}
