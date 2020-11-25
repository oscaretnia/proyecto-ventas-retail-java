/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.views;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author oscaretnia
 */
public class Content extends JPanel {

        private Image image;
        private final String resource;
        
        public Content(String resource) {
            this.resource = "/com/ventas/assets/" + resource;
        }

        @Override
        public void paint(Graphics g) {
            image = new ImageIcon(getClass().getResource(resource)).getImage();
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
