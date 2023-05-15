/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.employee;

import java.util.ArrayList;

import com.mycompany.Object.USER.User;
import com.mycompany.Object.USER.UserBUS;

/**
 *
 * @author khang
 */
public class TrangChinhJPanel extends javax.swing.JPanel {

    UserBUS userBUS = new UserBUS();
    ArrayList<User> listusers = new ArrayList<User>();

    /**
     * Creates new form TrangChuJPanel
     */
    public TrangChinhJPanel() {
        initComponents();
        LoadData();

    }

    public void LoadData() {
        listusers = userBUS.getUsers();
        User user = listusers.get(0);
        jLabelTen.setText("Chào mừng " + user.getTenUser() + " đã đăng nhập!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        jLabelTen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTen.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTen.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTen, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabelTen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTen;
    // End of variables declaration//GEN-END:variables
}
