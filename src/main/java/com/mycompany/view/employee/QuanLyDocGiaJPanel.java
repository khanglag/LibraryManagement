/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.employee;

import com.mycompany.view.themtaikhoanKH;
import com.mycompany.Object.DocGia.*;
import java.util.ArrayList;
import javax.swing.table.*;
import javax.swing.*;
import java.time.LocalDate;
/**
 *
 * @author khang
 */
public class QuanLyDocGiaJPanel extends javax.swing.JPanel {
    DocGiaBUS docGiaBUS = new DocGiaBUS();
    DefaultTableModel model;

    /**
     * Creates new form QuanLyDocGiaJPanel
     */
    public QuanLyDocGiaJPanel() {
        initComponents();
        model = (DefaultTableModel) tableTTDG.getModel();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuDocGia = new javax.swing.JPopupMenu();
        jMenuItemThemTaiKhoan = new javax.swing.JMenuItem();
        buttonGroupTTTK = new javax.swing.ButtonGroup();
        buttonGroupPhai = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tfCCCD = new javax.swing.JTextField();
        tfMaDocGia = new javax.swing.JTextField();
        tfTenDocGia = new javax.swing.JTextField();
        tfSoDienThoai = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        tfNgaySinh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jRadioButtonNu = new javax.swing.JRadioButton();
        btnTim = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableTTDG = new javax.swing.JTable();

        jMenuItemThemTaiKhoan.setText("jMenuItem1");
        jMenuItemThemTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemThemTaiKhoanMouseClicked(evt);
            }
        });
        jPopupMenuDocGia.add(jMenuItemThemTaiKhoan);

        jLabel1.setText("CCCD");

        jLabel10.setText("Mã đọc giả");

        jLabel11.setText("Tên đọc giả");

        jLabel12.setText("Số điện thoại");

        jLabel19.setText("Địa chỉ");

        tfCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCCCDActionPerformed(evt);
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

        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(89, 55));
        btnSua.setMinimumSize(new java.awt.Dimension(89, 55));
        btnSua.setPreferredSize(new java.awt.Dimension(99, 57));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLoad.setText("Làm mới");
        btnLoad.setPreferredSize(new java.awt.Dimension(99, 57));
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.setMaximumSize(new java.awt.Dimension(99, 57));
        btnThem.setMinimumSize(new java.awt.Dimension(99, 57));
        btnThem.setPreferredSize(new java.awt.Dimension(99, 57));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel43.setText("Ngày sinh");

        jLabel2.setText("Phái");

        buttonGroupPhai.add(jRadioButtonNam);
        jRadioButtonNam.setText("Nam");

        buttonGroupPhai.add(jRadioButtonNu);
        jRadioButtonNu.setText("Nữ");

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfTenDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tfMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnClear))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tfCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(80, 80, 80)
                                            .addComponent(btnTim)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButtonNam)
                                        .addGap(31, 31, 31)
                                        .addComponent(jRadioButtonNu))
                                    .addComponent(tfSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(tfDiaChi)
                                    .addComponent(tfNgaySinh)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTenDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonNam)
                            .addComponent(jRadioButtonNu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(tfSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tableTTDG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "CCCD", "Mã ĐG", "Tên", "Phái", "Ngày sinh", "Số điện thoại", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTTDG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTTDGMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableTTDG);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addGap(10, 10, 10))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void refreshData() {
        docGiaBUS = new DocGiaBUS();
        loadData();
    }
    public void loadData() {
        ArrayList<DocGia> arr = new ArrayList<DocGia>();
        arr = docGiaBUS.loadData();
        int i = 0;
        while (i <= arr.size() - 1) {
            DocGia docGia = arr.get(i);
            model.addRow(new Object[] {
                    ++i, docGia.getCCCD(), docGia.getMaDocGia(), docGia.getTenDocGia(), docGia.getGioiTinh(), docGia.getNgaySinh(), docGia.getSoDienThoai(), docGia.getDiaChi()
            });
            tableTTDG.setModel(model);
        }
    }

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        refreshData();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void tableTTDGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTTDGMouseClicked
        // TODO add your handling code here:
        int i = tableTTDG.getSelectedRow();
        if (i >= 0) {
            tfCCCD.setText(tableTTDG.getModel().getValueAt(i, 1).toString());
            tfMaDocGia.setText(tableTTDG.getModel().getValueAt(i, 2).toString());
            tfTenDocGia.setText(tableTTDG.getModel().getValueAt(i, 3).toString());
            if (tableTTDG.getModel().getValueAt(i, 4).toString().toUpperCase().equals("NAM")) {
                jRadioButtonNam.setSelected(true);
            } else {
                jRadioButtonNu.setSelected(true);
            }
            tfNgaySinh.setText(tableTTDG.getModel().getValueAt(i, 5).toString());
            
            tfSoDienThoai.setText(tableTTDG.getModel().getValueAt(i, 6).toString());
            tfDiaChi.setText(tableTTDG.getModel().getValueAt(i, 7).toString());
        }
    }//GEN-LAST:event_tableTTDGMouseClicked

    private void jMenuItemThemTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemThemTaiKhoanMouseClicked
        // TODO add your handling code here:
        new themtaikhoanKH().setVisible(true);
    }//GEN-LAST:event_jMenuItemThemTaiKhoanMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        try{
            ArrayList<DocGia> arr = new ArrayList<DocGia>();
            String maDocGia = tfMaDocGia.getText();
            String tenDocGia = tfTenDocGia.getText();
            String CCCD = tfCCCD.getText();
            String diaChi = tfDiaChi.getText();
            String ngaySinh = tfNgaySinh.getText();
            String SDT = tfSoDienThoai.getText();
            String gioiTinh = "";
            if(jRadioButtonNam.isSelected())
                gioiTinh += "NAM";
            else gioiTinh += "NỮ";

            arr = docGiaBUS.search(maDocGia, tenDocGia,  CCCD,  gioiTinh,  ngaySinh,  SDT,  diaChi);
            if (arr.size() != 0) {
                JOptionPane.showMessageDialog(this, "Hoàn tất tìm kiếm!");
                model.setRowCount(0);
                int i = 0;
                while (i <= arr.size() - 1) {
                    DocGia docGia = arr.get(i);
                    model.addRow(new Object[] {
                            ++i, docGia.getCCCD(), docGia.getMaDocGia(), docGia.getTenDocGia(), docGia.getGioiTinh(), docGia.getNgaySinh(), docGia.getSoDienThoai(), docGia.getDiaChi()
                    });
                }
            } else JOptionPane.showMessageDialog(this, "Không có dữ liệu cần tìm!");
        } catch(Exception ex) {
            System.out.print(ex);
        } 
    }//GEN-LAST:event_btnTimActionPerformed

    private void tfCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCCCDActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfCCCD.setText("");
        tfMaDocGia.setText("");
        tfTenDocGia.setText("");
        tfDiaChi.setText("");
        tfSoDienThoai.setText("");
        tfNgaySinh.setText("");
        buttonGroupPhai.clearSelection();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {
            if (tfMaDocGia.getText().trim().equals("") || tfCCCD.getText().trim().equals("")
                    || tfDiaChi.getText().trim().equals("") ||
                    tfTenDocGia.getText().trim().equals("") || tfSoDienThoai.getText().trim().equals("")
                    || tfNgaySinh.getText().trim().equals("")
                    ||jRadioButtonNam.isSelected() == false && jRadioButtonNu.isSelected() == false) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
                
            } else {
                DocGia docGia = new DocGia();
                docGia.setMaDocGia(tfMaDocGia.getText());
                docGia.setTenDocGia(tfTenDocGia.getText());
                if(jRadioButtonNam.isSelected())
                    docGia.setGioiTinh("NAM");
                else docGia.setGioiTinh("NỮ");
                docGia.setTonTai(true);
                docGia.setCCCD(tfCCCD.getText());
                docGia.setDiaChi(tfDiaChi.getText());
                docGia.setNgaySinh(LocalDate.parse(tfNgaySinh.getText()));
                docGia.setSoDienThoai(tfSoDienThoai.getText());
                docGia.setMaPQ(null);
               
                JOptionPane.showMessageDialog(this, docGiaBUS.add(docGia));
                model.setRowCount(0);
                refreshData();
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(getRootPane(),
                "Bạn có chắc muốn xoá " + tfTenDocGia.getText() + " không ?", "Chú ý",
                JOptionPane.YES_NO_OPTION);
        
        ArrayList<DocGia> arr = new ArrayList<DocGia>();
        arr = docGiaBUS.loadData();

        if (reply == JOptionPane.YES_OPTION) {
            for (DocGia docGia : arr) {
                if (docGia.getMaDocGia().equals(tfMaDocGia.getText().trim())) {
                    JOptionPane.showMessageDialog(this, docGiaBUS.delete(docGia));                  
                    break;
                }
            }
        }
        model.setRowCount(0);
        refreshData();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        ArrayList<DocGia> arr = new ArrayList<DocGia>();
        arr = docGiaBUS.loadData();
        for (DocGia docGia : arr) {
            if (docGia.getMaDocGia().equals(tfMaDocGia.getText().trim())) {
                docGia.setTenDocGia(tfTenDocGia.getText());
                docGia.setDiaChi(tfDiaChi.getText());
                if(jRadioButtonNam.isSelected())
                    docGia.setGioiTinh("NAM");
                else docGia.setGioiTinh("NỮ");
                docGia.setNgaySinh(LocalDate.parse(tfNgaySinh.getText()));
                docGia.setSoDienThoai(tfSoDienThoai.getText());
                JOptionPane.showMessageDialog(this, docGiaBUS.update(docGia));
                break;
            }
        }
        model.setRowCount(0);
        refreshData();
    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroupPhai;
    private javax.swing.ButtonGroup buttonGroupTTTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JMenuItem jMenuItemThemTaiKhoan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenuDocGia;
    private javax.swing.JRadioButton jRadioButtonNam;
    private javax.swing.JRadioButton jRadioButtonNu;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tableTTDG;
    private javax.swing.JTextField tfCCCD;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfMaDocGia;
    private javax.swing.JTextField tfNgaySinh;
    private javax.swing.JTextField tfSoDienThoai;
    private javax.swing.JTextField tfTenDocGia;
    // End of variables declaration//GEN-END:variables
}
