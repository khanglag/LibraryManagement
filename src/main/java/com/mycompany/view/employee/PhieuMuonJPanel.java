/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.employee;

import Menu.MenuHand;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khang
 */
public class PhieuMuonJPanel extends javax.swing.JPanel {
    DefaultTableModel model;
    /**
     * Creates new form PhieuMuonJPanel
     */
    public PhieuMuonJPanel() {
        initComponents();
        showcombodataDT();
        model= (DefaultTableModel) tablePhieuMuon.getModel();
        showtable();
       
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
        jLabel36 = new javax.swing.JLabel();
        jComboBoxMaSach = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        tfNgayTra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfSoLuong = new javax.swing.JTextField();
        TfTenDG = new javax.swing.JTextField();
        TfTensach = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TimDg = new javax.swing.JButton();
        Timsa = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablePhieuMuon = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btTim = new javax.swing.JButton();

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setToolTipText("Phiếu mượn");
        jPanel15.setName("Phiếu mượn"); // NOI18N

        jLabel31.setText("Mã phiếu mượn");

        jLabel32.setText("Mã đọc giả");

        tfMaPhieu.setEditable(true);
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
        jComboBoxMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMaNhanVienActionPerformed(evt);
            }
        });

        jLabel34.setText("Ngày mượn");

        tfNgayMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgayMuonActionPerformed(evt);
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

        tfSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSoLuongActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên đọc giả");

        jLabel3.setText("Tên sách");

        TimDg.setText("Tìm");
        TimDg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimDgActionPerformed(evt);
            }
        });

        Timsa.setText("Tìm");
        Timsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimsaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jComboBoxMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jComboBoxMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TfTenDG, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(TfTensach))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TimDg)
                                    .addComponent(Timsa)))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(tfNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfSoLuong)
                                    .addComponent(jComboBoxMaNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(tfNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tfMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfTenDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel2)
                    .addComponent(TimDg))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfTensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Timsa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(tfNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(tfNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxMaNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
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
        tablePhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePhieuMuonMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tablePhieuMuon);
        if (tablePhieuMuon.getColumnModel().getColumnCount() > 0) {
            tablePhieuMuon.getColumnModel().getColumn(0).setResizable(false);
            tablePhieuMuon.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablePhieuMuon.getColumnModel().getColumn(8).setResizable(false);
        }

        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(99, 57));
        btnXoa.setMinimumSize(new java.awt.Dimension(99, 57));
        btnXoa.setPreferredSize(new java.awt.Dimension(99, 57));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
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

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btTim.setText("Tìm");
        btTim.setMaximumSize(new java.awt.Dimension(99, 57));
        btTim.setMinimumSize(new java.awt.Dimension(99, 57));
        btTim.setPreferredSize(new java.awt.Dimension(99, 57));
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void jComboBoxMaDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMaDocGiaActionPerformed
        String ten=jComboBoxMaDocGia.getSelectedItem().toString();
        DocGiaBUS dgbus=new DocGiaBUS();
        for(DocGia itemDocGia:dgbus.search(ten, "", "", "", "", "", "")){
            TfTenDG.setText(itemDocGia.getTenDocGia());
        }
            
        
    }//GEN-LAST:event_jComboBoxMaDocGiaActionPerformed

    private void tfNgayTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayTraActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
             PhieuMuon pm= new PhieuMuon();
             PhieuMuonBUS pmbus=new PhieuMuonBUS();
             pm.setMaPhieu(pmbus.getMaphieumuon());
             pm.setMaDocGia(jComboBoxMaDocGia. getSelectedItem().toString());
             pm.setMaNhanVien(jComboBoxMaNhanVien.getSelectedItem().toString());
             pm.setMaSach(jComboBoxMaSach.getSelectedItem().toString());
             pm.setNgayMuon(LocalDate.now());
             pm.setNgayTra(MenuHand.convert(tfNgayTra.getText()));
             pm.setSoLuong(Integer.parseInt(tfSoLuong.getText()));
             pm.setTonTai(1);
        pmbus.them(pm);
        tfMaPhieu.setText(MenuHand.FormatString(pmbus.getMaphieumuon()));
        System.out.println(pm.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Không được để trống trường");
        }
        showtable();
        
        //Mã phiếu tạo tự động, lấy mã phiếu mượn của phiếu mượn cuối cùng đưa vào
        //tfMaPhieu.setText(Menu.MenuHand.FormatString(Mượn));
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int xoa =tablePhieuMuon.getSelectedColumn();
        PhieuMuonBUS pmbus= new PhieuMuonBUS();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jComboBoxMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMaSachActionPerformed
        String maphieu=jComboBoxMaSach.getSelectedItem().toString();
        SachBUS sbus= new SachBUS();
        for(Sach iSach:sbus.search(maphieu, "", "", "", "", "", "", "", "", "")){
            TfTensach.setText(iSach.getTenSach());
        }
    }//GEN-LAST:event_jComboBoxMaSachActionPerformed

    private void tfMaPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaPhieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaPhieuActionPerformed

    private void tfNgayMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayMuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayMuonActionPerformed

    private void jComboBoxMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMaNhanVienActionPerformed

    }//GEN-LAST:event_jComboBoxMaNhanVienActionPerformed

    private void tablePhieuMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePhieuMuonMouseClicked
        int select=tablePhieuMuon.getSelectedRow();
        if (select>=0) {
            DocGiaBUS gdBUS =new DocGiaBUS();
            SachBUS sabus=new SachBUS();
            String tendg = "", tensach="";
            for(DocGia itemDocGia:gdBUS.search(tablePhieuMuon.getModel().getValueAt(select, 3).toString(), "", "","", "", "", "")){
                 tendg=itemDocGia.getTenDocGia();
                 System.out.println("Tendg"+tablePhieuMuon.getModel().getValueAt(select, 3).toString());
                 System.out.println(tendg);
            }
            for(Sach itemSach:sabus.search(tablePhieuMuon.getModel().getValueAt(select, 4).toString(), "", "", "", "","", "", "", "", "")){
                 tensach=itemSach.getTenSach();
                 System.out.println(tensach);
            }
            tfMaPhieu.setText(tablePhieuMuon.getModel().getValueAt(select, 1).toString());
            TfTenDG.setText(tendg);
            TfTensach.setText(tensach);
        }
    }//GEN-LAST:event_tablePhieuMuonMouseClicked

    private void tfSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSoLuongActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTimActionPerformed

    private void TimDgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimDgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimDgActionPerformed

    private void TimsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimsaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TfTenDG;
    private javax.swing.JTextField TfTensach;
    private javax.swing.JButton TimDg;
    private javax.swing.JButton Timsa;
    private javax.swing.JButton btTim;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroupTinhTrang;
    private javax.swing.JComboBox<String> jComboBoxMaDocGia;
    private javax.swing.JComboBox<String> jComboBoxMaNhanVien;
    private javax.swing.JComboBox<String> jComboBoxMaSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable tablePhieuMuon;
    private javax.swing.JTextField tfMaPhieu;
    private javax.swing.JTextField tfNgayMuon;
    private javax.swing.JTextField tfNgayTra;
    private javax.swing.JTextField tfSoLuong;
    // End of variables declaration//GEN-END:variables
    public void showcombodataDT(){
        PhieuMuonBUS pm= new PhieuMuonBUS();
        tfMaPhieu.setText(MenuHand.FormatString(pm.getMaphieumuon()));
        DocGiaBUS dgbus = new DocGiaBUS();
                
                for(DocGia itempDocGia: dgbus.loadData()){
                     jComboBoxMaDocGia.addItem(itempDocGia.getMaDocGia());
                }
        SachBUS sabus = new SachBUS();
                for(Sach itemsa: sabus.loadData()){
                    jComboBoxMaSach.addItem(itemsa.getMaSach());
                }
        NhanVienBUS nvbus =new NhanVienBUS();
                for(NhanVien itemnv: nvbus.getDSNhanVien()){
                    jComboBoxMaNhanVien.addItem(itemnv.getMaNhanVien());
                }
                tfNgayMuon.setText(MenuHand.DatetoString(LocalDate.now()));
    }
    public void showtable(){
        PhieuMuonBUS pmbus= new PhieuMuonBUS();
        model.setRowCount(0);
        for(PhieuMuon itMuon:pmbus.loadData()){
            Object[] rowData={itMuon.getMaPhieu(),MenuHand.FormatString(itMuon.getMaPhieu()),itMuon.getMaSach(),itMuon.getMaDocGia(),itMuon.getMaNhanVien(),itMuon.getNgayMuon(),itMuon.getNgayTra(),itMuon.getSoLuong(),itMuon.isTonTai()};
            model.addRow(rowData);
        }
    }
}
