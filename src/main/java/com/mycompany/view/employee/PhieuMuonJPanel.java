/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.employee;

import com.mycompany.Object.DocGia.DocGia;
import com.mycompany.Object.DocGia.DocGiaBUS;
import com.mycompany.Object.NhanVien.NhanVien;
import com.mycompany.Object.NhanVien.NhanVienBUS;
import com.mycompany.Object.PhieuMuon.PhieuMuon;
import com.mycompany.Object.PhieuMuon.PhieuMuonBUS;
import com.mycompany.Object.Sach.Sach;
import com.mycompany.Object.Sach.SachBUS;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author khang
 */
public class PhieuMuonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhieuMuonJPanel
     */
    public PhieuMuonJPanel() {
        initComponents();
        showcombodataDT();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTinhTrang = new javax.swing.ButtonGroup();
        jPanel15 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tfMaPhieu = new javax.swing.JTextField();
        jComboBoxMaDocGia = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jComboBoxMaNhanVien = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        tfNgayMuon = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnXoa = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jComboBoxMaSach = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        tfNgayTra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfSoLuong = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablePhieuMuon = new javax.swing.JTable();

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setToolTipText("Phiếu mượn");
        jPanel15.setName("Phiếu mượn"); // NOI18N

        jLabel31.setText("Mã phiếu mượn");

        jLabel32.setText("Mã đọc giả");

        tfMaPhieu.setEditable(false);
        tfMaPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaPhieuActionPerformed(evt);
            }
        });

        jComboBoxMaDocGia.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboBoxMaDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMaDocGiaActionPerformed(evt);
            }
        });

        jLabel33.setText("Mã nhân viên");

        jComboBoxMaNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>());

        jLabel34.setText("Ngày mượn");

        tfNgayMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgayMuonActionPerformed(evt);
            }
        });

        jLabel35.setText("Tình trạng");

        buttonGroupTinhTrang.add(jRadioButton1);
        jRadioButton1.setText("Đang mượn");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(89, 55));
        btnSua.setMinimumSize(new java.awt.Dimension(89, 55));
        btnSua.setPreferredSize(new java.awt.Dimension(99, 57));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        buttonGroupTinhTrang.add(jRadioButton2);
        jRadioButton2.setText("Đã trả");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(99, 57));
        btnXoa.setMinimumSize(new java.awt.Dimension(99, 57));
        btnXoa.setPreferredSize(new java.awt.Dimension(99, 57));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel36.setText("Mã sách");
        jLabel36.setPreferredSize(new java.awt.Dimension(97, 16));

        jComboBoxMaSach.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboBoxMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMaSachActionPerformed(evt);
            }
        });

        jLabel37.setText("Ngày trả");

        tfNgayTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgayTraActionPerformed(evt);
            }
        });

        jLabel1.setText("Số lượng");

        jButton13.setText("Tìm");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfMaPhieu, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxMaDocGia, javax.swing.GroupLayout.Alignment.LEADING, 0, 142, Short.MAX_VALUE)
                            .addComponent(jComboBoxMaSach, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxMaNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, Short.MAX_VALUE)
                                .addGap(82, 82, 82))
                            .addComponent(tfNgayTra)
                            .addComponent(tfSoLuong)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(112, 112, 112))
                            .addComponent(tfNgayMuon))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(tfMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jComboBoxMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(jLabel35))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton13)
                        .addComponent(btnClear)))
                .addContainerGap())
        );

        tablePhieuMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã phiếu mượn", "Mã đọc giả", "Mã sách", "Mã NV", "Ngày mượn", "Hạn trả", "Số lượng", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tablePhieuMuon);
        if (tablePhieuMuon.getColumnModel().getColumnCount() > 0) {
            tablePhieuMuon.getColumnModel().getColumn(0).setResizable(false);
            tablePhieuMuon.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablePhieuMuon.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void jComboBoxMaDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMaDocGiaActionPerformed
        
    }//GEN-LAST:event_jComboBoxMaDocGiaActionPerformed

    private void tfNgayTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayTraActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        PhieuMuon pm= new PhieuMuon();
        PhieuMuonBUS pmbus=new PhieuMuonBUS();
        pm.setMaPhieu(tfMaPhieu.getText());
        pm.setMaDocGia(jComboBoxMaDocGia. getSelectedItem().toString());
        pm.setMaNhanVien(jComboBoxMaNhanVien.getSelectedItem().toString());
        pm.setMaSach(jComboBoxMaSach.getSelectedItem().toString());
        pm.setNgayMuon(LocalDate.parse(tfNgayMuon.getText()));
        pm.setNgayTra(LocalDate.parse(tfNgayTra.getText()));
        pm.setSoLuong(Integer.parseInt(tfSoLuong.getText()));
        pm.setTonTai(1);
        System.out.println(pm.toString());
        pmbus.them(pm);
        //Mã phiếu tạo tự động, lấy mã phiếu mượn của phiếu mượn cuối cùng đưa vào
        //tfMaPhieu.setText(Menu.MenuHand.FormatString(Mượn));
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfMaPhieu.setEditable(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void jComboBoxMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMaSachActionPerformed

    private void tfMaPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaPhieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaPhieuActionPerformed

    private void tfNgayMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayMuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayMuonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroupTinhTrang;
    private javax.swing.JButton jButton13;
    private javax.swing.JComboBox<String> jComboBoxMaDocGia;
    private javax.swing.JComboBox<String> jComboBoxMaNhanVien;
    private javax.swing.JComboBox<String> jComboBoxMaSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tablePhieuMuon;
    private javax.swing.JTextField tfMaPhieu;
    private javax.swing.JTextField tfNgayMuon;
    private javax.swing.JTextField tfNgayTra;
    private javax.swing.JTextField tfSoLuong;
    // End of variables declaration//GEN-END:variables
    public void showcombodataDT(){
        PhieuMuonBUS pm= new PhieuMuonBUS();
        tfMaPhieu.setText(pm.getMaphieumuon());
        DocGiaBUS dgbus = new DocGiaBUS();
                
                for(DocGia itempDocGia: dgbus.loadData()){
                     jComboBoxMaDocGia.addItem(itempDocGia.getMaDocGia());
                }
        SachBUS sabus = new SachBUS();
                for(Sach itemsa: sabus.getSachs()){
                    jComboBoxMaSach.addItem(itemsa.getMaSach());
                }
        NhanVienBUS nvbus =new NhanVienBUS();
                for(NhanVien itemnv: nvbus.getDSNhanVien()){
                    jComboBoxMaNhanVien.addItem(itemnv.getMaNhanVien());
                }
    }
}
