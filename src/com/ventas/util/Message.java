/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.util;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ponys
 */
public class Message {
    
    public static void info(JFrame parent, String message) {
        JOptionPane.showMessageDialog(parent, message, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void error(JFrame parent, String message) {
        JOptionPane.showMessageDialog(parent, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
}
