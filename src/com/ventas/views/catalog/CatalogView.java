/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.views.catalog;

/**
 *
 * @author oscaretnia
 */
public interface CatalogView {
    
    public void onSuccess();
    
    public void onError(String messaje);
    
    public void showCatalog(String[] catalog);
    
}
