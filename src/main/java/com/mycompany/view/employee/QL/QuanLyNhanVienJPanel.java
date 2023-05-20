/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.employee.QL;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mycompany.Object.NhanVien.NhanVien;
import com.mycompany.Object.NhanVien.NhanVienBUS;
import com.mycompany.Object.NhanVien.NhanVienDAO;
import com.mycompany.view.DangNhapJDialog;
import com.mycompany.view.themtaikhoanQL;

import ConnectDB.ConnectDB;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.jar.Attributes;

import javax.swing.JFileChooser;
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenuNV = new javax.swing.JPopupMenu();
        jMenuItemNV = new javax.swing.JMenuItem();
        Phai = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnInExcel = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tfMaNV = new javax.swing.JTextField();
        tfTenNV = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jRadioButtonNu = new javax.swing.JRadioButton();
        tfNgaySinh = new javax.swing.JTextField();
        tfCCCD = new javax.swing.JTextField();
        tfSDT = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableNhanVien = new javax.swing.JTable();

        jPopupMenuNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenuNVMouseClicked(evt);
            }
        });

        jMenuItemNV.setText("Thêm tài khoản");
        jMenuItemNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemNVMouseClicked(evt);
            }
        });
        jMenuItemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNVActionPerformed(evt);
            }
        });
        jPopupMenuNV.add(jMenuItemNV);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 76);
        jPanel7.add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/icons8_cancel_30px_1.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(99, 57));
        btnXoa.setMinimumSize(new java.awt.Dimension(99, 57));
        btnXoa.setPreferredSize(new java.awt.Dimension(99, 57));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(99, 57));
        btnSua.setMinimumSize(new java.awt.Dimension(89, 55));
        btnSua.setPreferredSize(new java.awt.Dimension(99, 57));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSua);

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Refresh.png"))); // NOI18N
        btnLoad.setText("Load");
        btnLoad.setMaximumSize(new java.awt.Dimension(99, 57));
        btnLoad.setPreferredSize(new java.awt.Dimension(99, 57));
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        jPanel2.add(btnLoad);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 6, 0);
        jPanel7.add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(3, 0, 0, 2));

        btnInExcel.setText("In Excel");
        btnInExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInExcelActionPerformed(evt);
            }
        });
        jPanel3.add(btnInExcel);

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        jPanel3.add(btnTim);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        jPanel7.add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridLayout(7, 0, 0, 10));

        jLabel39.setText("Mã NV");
        jPanel4.add(jLabel39);

        jLabel40.setText("Tên");
        jPanel4.add(jLabel40);

        jLabel1.setText("Phai");
        jPanel4.add(jLabel1);

        jLabel43.setText("Ngày sinh");
        jPanel4.add(jLabel43);

        jLabel2.setText("CCCD");
        jPanel4.add(jLabel2);

        jLabel41.setText("Số điện thoại");
        jPanel4.add(jLabel41);

        jLabel42.setText("Địa chỉ");
        jPanel4.add(jLabel42);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel7.add(jPanel4, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridLayout(7, 0, 0, 10));
        jPanel5.add(tfMaNV);
        jPanel5.add(tfTenNV);

        jPanel6.setLayout(new java.awt.GridLayout());

        Phai.add(jRadioButtonNam);
        jRadioButtonNam.setText("Nam");
        jRadioButtonNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNamActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButtonNam);

        Phai.add(jRadioButtonNu);
        jRadioButtonNu.setText("Nữ");
        jRadioButtonNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNuActionPerformed(evt);
            }
        });
        jPanel6.add(jRadioButtonNu);

        jPanel5.add(jPanel6);
        jPanel5.add(tfNgaySinh);
        jPanel5.add(tfCCCD);
        jPanel5.add(tfSDT);
        jPanel5.add(tfDiaChi);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel7.add(jPanel5, gridBagConstraints);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInExcelActionPerformed
        // TODO add your handling code here:
        try{
            JFileChooser fChooser = new JFileChooser();
            int choose = fChooser.showSaveDialog(null);
            if(choose == JFileChooser.APPROVE_OPTION) {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Nhân viên");
                XSSFRow row = null;
                Cell cell = null;

                String dateFormat = "yyyy-MM-dd";
                CellStyle style = workbook.createCellStyle();
                DataFormat dataFormat = workbook.createDataFormat();
                style.setDataFormat(dataFormat.getFormat(dateFormat));
                
                row = sheet.createRow(3);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue("STT");

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue("Mã nhân viên");

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("Tên nhân viên");

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue("Phái");

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue("Ngày sinh");

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue("CCCD");

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue("Số điện thoại");

                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue("Địa chỉ");

                ArrayList<NhanVien> arr = nVienBUS.getDSNhanVien();

                for(int i = 0; i < arr.size(); i++) {
                    row = sheet.createRow(4 + i);

                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(arr.get(i).getMaNhanVien());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(arr.get(i).getTenNhanVien());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(arr.get(i).getGioiTinh());

                    cell = row.createCell(4);
                    cell.setCellValue(arr.get(i).getNgaySinh());
                    cell.setCellStyle(style);

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(arr.get(i).getChungMinhThu());

                    cell = row.createCell(6, CellType.STRING);
                    cell.setCellValue(arr.get(i).getSoDienThoai());

                    cell = row.createCell(7, CellType.STRING);
                    cell.setCellValue(arr.get(i).getDiaChi());
                }

                File file = new File(fChooser.getSelectedFile().toString() + ".xlsx");
                try {
                    FileOutputStream fo = new FileOutputStream(file);
                    workbook.write(fo);
                    JOptionPane.showMessageDialog(this, "Đã in!");
                    fo.close();
                    workbook.close();
                } catch(FileNotFoundException e) {
                    System.out.println(e);
                }
            }
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnInExcelActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        refreshData();
    }//GEN-LAST:event_btnLoadActionPerformed

    private void jMenuItemNVActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemNVActionPerformed
        // TODO add your handling code here:
        int i = jTableNhanVien.getSelectedRow();
        String str = null;
        if (i >= 0) {
            str = jTableNhanVien.getModel().getValueAt(i, 1).toString();
        }
        ConnectDB connectDB = new ConnectDB();
        boolean success = false;
        try {
            String qry = "SELECT * from taikhoan,phanquyen,nhanvien WHERE taikhoan.MAPQ=phanquyen.MAPQ and phanquyen.MAPQ = nhanvien.MAPQ and nhanvien.MANV='"
                    + str + "'";
            ResultSet rset = connectDB.sqlQuery(qry);
            success = rset.next();
            System.out.println(success);
        } catch (Exception e) {
            // TODO: handle exception
        }
        if (!success) {
            new themtaikhoanQL(str).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại!");
        }

    }// GEN-LAST:event_jMenuItemNVActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btnTimActionPerformed

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
        jPopupMenuNV.show(jTableNhanVien, evt.getX(), evt.getY());
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
                nv.setNgaySinh(Menu.MenuHand.convert(tfNgaySinh.getText()));
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
                nv.setNgaySinh(Menu.MenuHand.convert(tfNgaySinh.getText()));
                nv.setSoDienThoai(tfSDT.getText());
                nv.setMaPQ(null);
                System.out.println(phai);
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

    }// GEN-LAST:event_jMenuItemNVMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Phai;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnInExcel;
    private javax.swing.JButton btnLoad;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
