/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.views.auth;

import com.ventas.models.entities.User;

/**
 *
 * @author oscaretnia
 */
public interface SignView {
    
    public void onSuccess(User usuario);
    
    public void onError(String mensaje);
    
    public void disposes();
    
}
