/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.models.services;

import com.ventas.models.db.Data;
import com.ventas.models.entities.Shipment;
import java.util.List;

/**
 *
 * @author oscaretnia
 */
public class ShipmentService {
    
    Data db = Data.getInstance();
    
    public void makeShipment(String department, String city, String neighborhood) {
        db.addShipment(new Shipment(department, city, neighborhood));
    }
    
    public List<Shipment> getShipments() {
        return db.getShipments();
    }
    
}
