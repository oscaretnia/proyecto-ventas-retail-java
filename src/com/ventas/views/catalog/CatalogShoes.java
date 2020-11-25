package com.ventas.views.catalog;

import com.ventas.controllers.CatalogController;
import com.ventas.util.Message;
import com.ventas.views.Content;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tlser
 */
public class CatalogShoes extends javax.swing.JFrame implements CatalogView {

    private final CatalogController controller;
    
    
    Content content = new Content("zapatos-hombre-portada.jpg");

    public CatalogShoes() {
        setContentPane(content);
        setResizable(false);
        initComponents();
        
        controller = new CatalogController(this);
        
        //Populate list
        controller.showCatalog("Zapatos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jComboBox13 = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox15 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox();
        jTextField7 = new javax.swing.JTextField();
        jComboBox20 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listShoes = new javax.swing.JList<>();
        jLabel28 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnSale = new javax.swing.JButton();
        txtQty = new javax.swing.JSpinner();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "         ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "         ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel19.setText("Cantidad");

        jLabel20.setText("Precio");

        jLabel21.setText("Color");

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Negro", "Gris", "Verde", "Azul", "Amarillo" }));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "         ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel22.setText("Cantidad");

        jLabel23.setText("Precio");

        jLabel13.setText("Cantidad");

        jLabel24.setText("Color");

        jLabel14.setText("Precio");

        jLabel15.setText("Color");

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Negro", "Gris", "Verde", "Azul", "Amarillo" }));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Negro", "Gris", "Verde", "Azul", "Amarillo" }));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "         ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel25.setText("Cantidad");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Negro", "Gris", "Verde", "Azul", "Amarillo" }));

        jLabel26.setText("Precio");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel27.setText("Color");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "         ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "         ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel16.setText("Cantidad");

        jLabel17.setText("Precio");

        jLabel18.setText("Color");

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Negro", "Gris", "Verde", "Azul", "Amarillo" }));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel31.setText("Cantidad");

        jLabel32.setText("Precio");

        jLabel33.setText("Color");

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Negro", "Gris", "Verde", "Azul", "Amarillo" }));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "         ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listShoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listShoes.setForeground(new java.awt.Color(102, 102, 102));
        listShoes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listShoes);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("CATALOGO DE ZAPATOS");

        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setText("OMITIR");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSale.setText("REALIZAR COMPRA");
        btnSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaleActionPerformed(evt);
            }
        });

        txtQty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQty))
                .addGap(59, 59, 59))
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel28)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSale)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaleActionPerformed
       if (listShoes.getSelectedValue() != null) {
          controller.doSale(listShoes.getSelectedValue(), txtQty.getValue().toString());
       } else {
           onError("Debe seleccionar un producto");
       }
    }//GEN-LAST:event_btnSaleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSale;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox19;
    private javax.swing.JComboBox jComboBox20;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JList<String> listShoes;
    private javax.swing.JSpinner txtQty;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onSuccess() {
        Message.info(this, "La compra fue exitosa");
    }
    
    @Override
    public void onError(String message) {
        Message.error(this, message);
    }
    
    @Override
    public void showCatalog(String[] catalog) {
        listShoes.setListData(catalog);
    }
    
    public void start() {
        CatalogShoes catalog = new CatalogShoes();
        catalog.setLocationRelativeTo(null);
        catalog.setTitle("Catalogo de accesorios");
        catalog.setVisible(true);
    }
}
