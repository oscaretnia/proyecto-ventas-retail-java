package com.ventas;


import com.ventas.views.auth.RoleView;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sherlock Holmes
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
        
        new RoleView().start();
        
    }
    
}
