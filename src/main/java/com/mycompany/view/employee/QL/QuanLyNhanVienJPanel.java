/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.employee.QL;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.mycompany.Object.NhanVien.NhanVien;
import com.mycompany.Object.NhanVien.NhanVienBUS;
import com.mycompany.Object.NhanVien.NhanVienDAO;
import com.mycompany.view.themtaikhoanQL;

/**
 *
 * @author khang
 */
public class QuanLyNhanVienJPanel extends javax.swing.JPanel {

    NhanVienBUS nVienBUS = new NhanVienBUS();
    DefaultTableModel model;
    ArrayList<NhanVien> list = new ArrayList<NhanVien>();

    /**
     * Creates new form QuanLyNhanVienJPanel
     */
    public QuanLyNhanVienJPanel() {
        initComponents();
        model = (DefaultTableModel) jTableNhanVien.getModel();
        LoadData();
    }

    public void LoadData() {
        list = nVienBUS.getDSNhanVien();
        int i = 0;
        while (i <= list.size() - 1) {
            NhanVien nv = list.get(i);
            model.addRow(new Object[] {
                    ++i, nv.getMaNhanVien(), nv.getTenNhanVien(), nv.getGioiTinh(), nv.getNgaySinh(),
                    nv.getChungMinhThu(), nv.getSoDienThoai(), nv.getDiaChi()
            });
            jTableNhanVien.setModel(model);

        }

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

        jPopupMenuNV = new javax.swing.JPopupMenu();
        jMenuItemNV = new javax.swing.JMenuItem();
        Phai = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        tfMaNV = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        tfTenNV = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        tfNgaySinh = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jRadioButtonNu = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        tfCCCD = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnLoad2 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableNhanVien = new javax.swing.JTable();

        jMenuItemNV.setText("jMenuItem1");
        jMenuItemNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemNVMouseClicked(evt);
            }
        });
        jPopupMenuNV.add(jMenuItemNV);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/icons8_cancel_30px_1.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(99, 57));
        btnXoa.setMinimumSize(new java.awt.Dimension(99, 57));
        btnXoa.setPreferredSize(new java.awt.Dimension(99, 57));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(89, 55));
        btnSua.setMinimumSize(new java.awt.Dimension(89, 55));
        btnSua.setPreferredSize(new java.awt.Dimension(99, 57));

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Refresh.png"))); // NOI18N
        btnLoad.setText("Làm mới");
        btnLoad.setPreferredSize(new java.awt.Dimension(99, 57));
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        jLabel39.setText("Mã NV");

        jLabel40.setText("Tên");

        jLabel41.setText("Số điện thoại");

        jLabel42.setText("Địa chỉ");

        jLabel43.setText("Ngày sinh");

        jLabel1.setText("Phai");

        Phai.add(jRadioButtonNam);
        jRadioButtonNam.setText("Nam");

        Phai.add(jRadioButtonNu);
        jRadioButtonNu.setText("Nữ");

        jLabel2.setText("CCCD");

        btnTim.setText("Tim");

        btnLoad2.setText("Clear");
        btnLoad2.setPreferredSize(new java.awt.Dimension(99, 57));
        btnLoad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoad2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel42))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tfTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tfDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tfSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonNam)
                                        .addGap(31, 31, 31)
                                        .addComponent(jRadioButtonNu))
                                    .addComponent(tfCCCD)))
                            .addComponent(jLabel43)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel41))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTim)
                            .addComponent(btnLoad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(35, 35, 35)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(tfMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButtonNam)
                    .addComponent(jRadioButtonNu)
                    .addComponent(btnLoad2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã NV", "Tên", "Phái", "Ngày sinh", "CCCD", "Số ĐT", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTableNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnLoadActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnThemActionPerformed

    private void jMenuItemNVMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jMenuItemNVMouseClicked
        // TODO add your handling code here:
        new themtaikhoanQL().setVisible(true);
    }// GEN-LAST:event_jMenuItemNVMouseClicked

    private void btnLoad2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoad2ActionPerformed
        // TODO add your handling code here:
        tfCCCD.setText("");
        tfDiaChi.setText("");
        tfMaNV.setText("");
        tfNgaySinh.setText("");
        tfSDT.setText("");
        tfTenNV.setText("");
    }// GEN-LAST:event_btnLoad2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Phai;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnLoad2;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JMenuItem jMenuItemNV;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenuNV;
    private javax.swing.JRadioButton jRadioButtonNam;
    private javax.swing.JRadioButton jRadioButtonNu;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTable jTableNhanVien;
    private javax.swing.JTextField tfCCCD;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfMaNV;
    private javax.swing.JTextField tfNgaySinh;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTenNV;
    // End of variables declaration//GEN-END:variables
}
