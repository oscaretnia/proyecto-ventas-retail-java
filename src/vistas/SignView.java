/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelo.User;

/**
 *
 * @author oscaretnia
 */
public interface SignView {
    
    public void onSuccess(User usuario);
    
    public void onError(String mensaje);
    
}
