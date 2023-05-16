/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.KH;

/**
 *
 * @author khang
 */
public class QuanLyMuonKHJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyMuonKHJPanel
     */
    public QuanLyMuonKHJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfTenSach = new javax.swing.JTextField();
        tfMaSach = new javax.swing.JTextField();
        tfMaNhaXuatBan = new javax.swing.JTextField();
        tfMaTacGia = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnXoaHet = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuanLyMuon = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(742, 566));
        setLayout(new java.awt.GridBagLayout());

        jPanel8.setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridLayout(4, 0, 0, 10));

        jLabel11.setText("Tên sách");
        jPanel1.add(jLabel11);

        jLabel12.setText("Mã sách");
        jPanel1.add(jLabel12);

        jLabel13.setText("Mã nhà xuất bản");
        jPanel1.add(jLabel13);

        jLabel14.setText("Mã tác giả");
        jPanel1.add(jLabel14);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 33, 0, 0);
        jPanel8.add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridLayout(4, 0, 0, 10));
        jPanel2.add(tfTenSach);
        jPanel2.add(tfMaSach);

        tfMaNhaXuatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaNhaXuatBanActionPerformed(evt);
            }
        });
        jPanel2.add(tfMaNhaXuatBan);
        jPanel2.add(tfMaTacGia);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 140;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 44, 0, 0);
        jPanel8.add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

        btnXoaHet.setText("Xoá hết");
        btnXoaHet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHetActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoaHet);

        btnTim.setText("Tìm");
        jPanel3.add(btnTim);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 18, 0, 0);
        jPanel8.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 6);
        add(jPanel8, gridBagConstraints);

        tableQuanLyMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "Nhà xuất bản", "Tác giả"
            }
        ));
        jScrollPane1.setViewportView(tableQuanLyMuon);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 443;
        gridBagConstraints.ipady = 214;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 6, 6);
        add(jScrollPane1, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Quản lý mượn");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 173, 0, 0);
        add(jLabel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tfMaNhaXuatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaNhaXuatBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaNhaXuatBanActionPerformed

    private void btnXoaHetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHetActionPerformed
        // TODO add your handling code here:
        tfTenSach.setText("");
        tfMaSach.setText("");
        tfMaNhaXuatBan.setText("");
        tfMaTacGia.setText("");
        
    }//GEN-LAST:event_btnXoaHetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoaHet;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableQuanLyMuon;
    private javax.swing.JTextField tfMaNhaXuatBan;
    private javax.swing.JTextField tfMaSach;
    private javax.swing.JTextField tfMaTacGia;
    private javax.swing.JTextField tfTenSach;
    // End of variables declaration//GEN-END:variables
}
