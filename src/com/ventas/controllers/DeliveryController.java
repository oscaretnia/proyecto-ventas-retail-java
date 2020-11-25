/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.controllers;

import com.ventas.models.services.DeliveryService;
import com.ventas.views.delivery.DeliveryView;

/**
 *
 * @author Pony
 */

public class DeliveryController {
    
    private final DeliveryService model;
    private final DeliveryView view;

    public DeliveryController(DeliveryView view) {
        this.model = new DeliveryService();
        this.view = view;
    }
    
    public void doDelivery(String name, String lastname, String address, String home, String methodPayment) {
        model.makeDelivery(name, lastname, address, home, methodPayment);
        view.onSuccess();
    }
    
    
    
}
