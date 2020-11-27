/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.controllers;

import com.ventas.models.services.ShipmentService;
import com.ventas.views.delivery.ShipmentView;

/**
 *
 * @author Pony
 */

public class ShipmentController {
    
    private final ShipmentService model;
    private final ShipmentView view;

    public ShipmentController(ShipmentView view) {
        this.model = new ShipmentService();
        this.view = view;
    }
    
    public void doShipment(String department, String city, String neighborhood) {
        model.makeShipment(department, city, neighborhood);
        view.onSuccess();
    }
    
    
    
}
