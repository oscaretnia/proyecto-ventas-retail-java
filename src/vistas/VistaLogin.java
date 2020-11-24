/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelo.Usuario;

/**
 *
 * @author oscaretnia
 */
public interface VistaLogin {
    
    public void onSuccess(Usuario usuario);
    
    public void onError(String mensaje);
    
}
