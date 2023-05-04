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
import com.mycompany.view.DangNhapJDialog;
import com.mycompany.view.themtaikhoanQL;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.jar.Attributes;
import javax.swing.JOptionPane;

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

        LoadData();
    }

    public void LoadData() {
        model = (DefaultTableModel) jTableNhanVien.getModel();
        model.setRowCount(0);
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuNV = new javax.swing.JPopupMenu();
        jMenuItemNV = new javax.swing.JMenuItem();
        Phai = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
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
        btnClear = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableNhanVien = new javax.swing.JTable();

        jPopupMenuNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenuNVMouseClicked(evt);
            }
        });

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

        btnXoa.setIcon(
                new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/icons8_cancel_30px_1.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(99, 57));
        btnXoa.setMinimumSize(new java.awt.Dimension(99, 57));
        btnXoa.setPreferredSize(new java.awt.Dimension(99, 57));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(89, 55));
        btnSua.setMinimumSize(new java.awt.Dimension(89, 55));
        btnSua.setPreferredSize(new java.awt.Dimension(99, 57));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
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
        jRadioButtonNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNamActionPerformed(evt);
            }
        });

        Phai.add(jRadioButtonNu);
        jRadioButtonNu.setText("Nữ");
        jRadioButtonNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNuActionPerformed(evt);
            }
        });

        jLabel2.setText("CCCD");

        btnTim.setText("Tim");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel39)
                                                                        .addComponent(jLabel40)
                                                                        .addComponent(jLabel42))
                                                                .addGap(93, 93, 93)
                                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(tfMaNV,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                200, Short.MAX_VALUE)
                                                                        .addComponent(tfTenNV,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                200, Short.MAX_VALUE)
                                                                        .addComponent(tfDiaChi,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                200, Short.MAX_VALUE)
                                                                        .addComponent(tfSDT,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                200, Short.MAX_VALUE)
                                                                        .addComponent(tfNgaySinh,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                200, Short.MAX_VALUE)
                                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                .addComponent(jRadioButtonNam)
                                                                                .addGap(31, 31, 31)
                                                                                .addComponent(jRadioButtonNu))
                                                                        .addComponent(tfCCCD)))
                                                        .addComponent(jLabel43)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel41))
                                                .addGap(112, 112, 112))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(btnThem)
                                                .addGap(35, 35, 35)
                                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnClear)
                                                        .addComponent(btnTim))))
                                .addContainerGap(103, Short.MAX_VALUE)));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout
                                                .createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel39)
                                                        .addComponent(tfMaNV, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfTenNV, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel40))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jRadioButtonNam)
                                                        .addComponent(jRadioButtonNu))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel43)
                                                        .addComponent(tfNgaySinh,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(tfCCCD, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel41)
                                                        .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel42)
                                                        .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel7Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout
                                                .createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnTim)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnClear)))
                                .addContainerGap()));

        jTableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "STT", "Mã NV", "Tên", "Phái", "Ngày sinh", "CCCD", "Số ĐT", "Địa chỉ"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTableNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNhanVienMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTableNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 279,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonNamActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButtonNamActionPerformed
        // TODO add your handling code here:
        phai = "NAM";
    }// GEN-LAST:event_jRadioButtonNamActionPerformed

    private void jRadioButtonNuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButtonNuActionPerformed
        // TODO add your handling code here:
        phai = "NỮ";
    }// GEN-LAST:event_jRadioButtonNuActionPerformed

    private void jTableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTableNhanVienMouseClicked
        // TODO add your handling code here:
        int i = jTableNhanVien.getSelectedRow();
        if (i >= 0) {
            tfMaNV.setText(jTableNhanVien.getModel().getValueAt(i, 1).toString());
            tfTenNV.setText(jTableNhanVien.getModel().getValueAt(i, 2).toString());
            if (jTableNhanVien.getModel().getValueAt(i, 3).toString().toUpperCase().equals("NAM")) {
                jRadioButtonNam.setSelected(true);
            } else {
                jRadioButtonNu.setSelected(true);
            }
            tfNgaySinh.setText(jTableNhanVien.getModel().getValueAt(i, 4).toString());
            tfCCCD.setText(jTableNhanVien.getModel().getValueAt(i, 5).toString());
            tfSDT.setText(jTableNhanVien.getModel().getValueAt(i, 6).toString());
            tfDiaChi.setText(jTableNhanVien.getModel().getValueAt(i, 7).toString());

        }
        // jPopupMenuNV.show(jTableNhanVien, evt.getX(),evt.getY());
    }// GEN-LAST:event_jTableNhanVienMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(getRootPane(),
                "Bạn có chắc muốn xoá " + tfTenNV.getText() + " không ?", "Chú ý",
                JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            for (NhanVien nv : list) {
                if (nv.getMaNhanVien().equals(tfMaNV.getText().trim())) {
                    nVienBUS.deletedNhanVien(nv);
                    break;
                }
            }
        }
        refreshData();
    }// GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        for (NhanVien nv : list) {
            if (nv.getMaNhanVien().equals(tfMaNV.getText().trim())) {
                nv.setTenNhanVien(tfTenNV.getText());
                nv.setDiaChi(tfDiaChi.getText());
                nv.setGioiTinh(phai);
                nv.setNgaySinh(Menu.FormatDate.convert(tfNgaySinh.getText()));
                nv.setSoDienThoai(tfSDT.getText());
                nVienBUS.updateNhanVien(nv);
                break;
            }
        }
        refreshData();
    }// GEN-LAST:event_btnSuaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfCCCD.setText("");
        tfDiaChi.setText("");
        tfMaNV.setText("");
        tfNgaySinh.setText("");
        tfSDT.setText("");
        tfTenNV.setText("");
    }// GEN-LAST:event_btnClearActionPerformed
    // GEN-LAST:event_btnClearActionPerformed

    private void jPopupMenuNVMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPopupMenuNVMouseClicked
        // TODO add your handling code here:
    }
    // GEN-FIRST:event_btnLoadActionPerformed
    // TODO add your handling code here:
    // GEN-LAST:event_btnLoadActionPerformed
    // GEN-LAST:event_jPopupMenuNVMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:

        try {
            if (tfMaNV.getText().trim().equals("") || tfCCCD.getText().trim().equals("")
                    || tfDiaChi.getText().trim().equals("") ||
                    tfTenNV.getText().trim().equals("") || tfSDT.getText().trim().equals("")
                    || tfNgaySinh.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin");
                System.out.println(phai);
            } else {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(tfMaNV.getText());
                nv.setTenNhanVien(tfTenNV.getText());
                nv.setGioiTinh(phai);
                nv.setTonTai(true);
                nv.setChungMinhThu(tfCCCD.getText());
                nv.setDiaChi(tfDiaChi.getText());
                nv.setNgaySinh(Menu.FormatDate.convert(tfNgaySinh.getText()));
                nv.setSoDienThoai(tfSDT.getText());
                System.out.println(tfMaNV.getText());
                JOptionPane.showMessageDialog(this, nVienBUS.addNhanVien(nv));
                jTableNhanVien.repaint();
                refreshData();
            }
        } catch (Exception ex) {

        }

        // tfMaNV.getText().trim().equals("")||tfTenNV.getText().trim().equals("")||tfCCCD.getText().trim().equals(""),
        // tfSDT.getText().trim().equals("")||tfDiaChi.getText().trim().equals(""
    }// GEN-LAST:event_btnThemActionPerformed

    public void refreshData() {
        nVienBUS = new NhanVienBUS();
        LoadData();
    }

    private void jMenuItemNVMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jMenuItemNVMouseClicked
        // TODO add your handling code here:
        new themtaikhoanQL().setVisible(true);
    }// GEN-LAST:event_jMenuItemNVMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Phai;
    private javax.swing.JButton btnClear;
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
    private String phai = null;
}
