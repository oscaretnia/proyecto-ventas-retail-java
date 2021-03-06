package com.ventas.views;

import com.ventas.views.admin.ProfileView;
import com.ventas.views.catalog.CatalogAccessories;
import com.ventas.views.catalog.CatalogMens;
import com.ventas.views.catalog.CatalogShoes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tlser
 */
public class ClientView extends javax.swing.JFrame {

    
    private final Content content = new Content("profile.jpg");
    private final String userId;
    
    public ClientView(String userId) {
        setContentPane(content);
        setResizable(false);
        initComponents();
        this.userId = userId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCatalogMens = new javax.swing.JLabel();
        btnCatalogAccessories = new javax.swing.JLabel();
        btnCatalogShoes = new javax.swing.JLabel();
        btnModifyProfile = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Vivaldi", 0, 36)); // NOI18N
        jLabel3.setText("Store");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Vivaldi", 3, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manment");

        jLabel4.setFont(new java.awt.Font("Vivaldi", 3, 45)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Store");

        btnCatalogMens.setBackground(new java.awt.Color(153, 153, 255));
        btnCatalogMens.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCatalogMens.setForeground(new java.awt.Color(255, 255, 255));
        btnCatalogMens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCatalogMens.setText("Catalogo Hombres");
        btnCatalogMens.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153)));
        btnCatalogMens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogMens.setOpaque(true);
        btnCatalogMens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatalogMensMouseClicked(evt);
            }
        });

        btnCatalogAccessories.setBackground(new java.awt.Color(255, 153, 153));
        btnCatalogAccessories.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCatalogAccessories.setForeground(new java.awt.Color(255, 255, 255));
        btnCatalogAccessories.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCatalogAccessories.setText("Catalogo Accesorios");
        btnCatalogAccessories.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0)));
        btnCatalogAccessories.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogAccessories.setOpaque(true);
        btnCatalogAccessories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatalogAccessoriesMouseClicked(evt);
            }
        });

        btnCatalogShoes.setBackground(new java.awt.Color(153, 255, 153));
        btnCatalogShoes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCatalogShoes.setForeground(new java.awt.Color(255, 255, 255));
        btnCatalogShoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCatalogShoes.setText("Catalogo Zapatos");
        btnCatalogShoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 0), new java.awt.Color(0, 153, 0), new java.awt.Color(0, 153, 0), new java.awt.Color(0, 153, 0)));
        btnCatalogShoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogShoes.setOpaque(true);
        btnCatalogShoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatalogShoesMouseClicked(evt);
            }
        });

        btnModifyProfile.setBackground(new java.awt.Color(255, 255, 255));
        btnModifyProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModifyProfile.setForeground(new java.awt.Color(51, 51, 51));
        btnModifyProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModifyProfile.setText("Modificar perfil");
        btnModifyProfile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnModifyProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModifyProfile.setOpaque(true);
        btnModifyProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifyProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModifyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCatalogMens, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCatalogAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCatalogShoes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCatalogMens, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatalogAccessories, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCatalogShoes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnModifyProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCatalogMensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogMensMouseClicked
        new CatalogMens(userId).start();
        this.dispose();
    }//GEN-LAST:event_btnCatalogMensMouseClicked

    private void btnCatalogAccessoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogAccessoriesMouseClicked
        new CatalogAccessories(userId).start();
        this.dispose();
    }//GEN-LAST:event_btnCatalogAccessoriesMouseClicked

    private void btnCatalogShoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogShoesMouseClicked
        new CatalogShoes(userId).start();
        this.dispose();
    }//GEN-LAST:event_btnCatalogShoesMouseClicked

    private void btnModifyProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyProfileMouseClicked
        new ProfileView(userId).start();
        this.dispose();
    }//GEN-LAST:event_btnModifyProfileMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCatalogAccessories;
    private javax.swing.JLabel btnCatalogMens;
    private javax.swing.JLabel btnCatalogShoes;
    private javax.swing.JLabel btnModifyProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    public void start() {
        setLocationRelativeTo(null);
        setTitle("Perfil de cliente");
        setVisible(true);
    }
}
