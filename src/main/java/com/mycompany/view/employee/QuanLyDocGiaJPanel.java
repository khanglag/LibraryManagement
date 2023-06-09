/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.employee;

import Menu.MenuHand;
import com.mycompany.view.themtaikhoanKH;

import ConnectDB.ConnectDB;

import com.mycompany.Object.DocGia.*;
import com.mycompany.view.thethuvien;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenuDocGia = new javax.swing.JPopupMenu();
        jMenuItemThemTaiKhoan = new javax.swing.JMenuItem();
        jMenuItemThemTheThuVien = new javax.swing.JMenuItem();
        buttonGroupTTTK = new javax.swing.ButtonGroup();
        buttonGroupPhai = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnTim = new javax.swing.JButton();
        btnInExcel = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tfCCCD = new javax.swing.JTextField();
        tfMaDocGia = new javax.swing.JTextField();
        tfTenDocGia = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jRadioButtonNu = new javax.swing.JRadioButton();
        tfNgaySinh = new javax.swing.JTextField();
        tfSoDienThoai = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableTTDG = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        jMenuItemThemTaiKhoan.setText("Thêm tài khoản");
        jMenuItemThemTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemThemTaiKhoanMouseClicked(evt);
            }
        });
        jMenuItemThemTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThemTaiKhoanActionPerformed(evt);
            }
        });
        jPopupMenuDocGia.add(jMenuItemThemTaiKhoan);

        jMenuItemThemTheThuVien.setText("Thêm thẻ thư viện");
        jMenuItemThemTheThuVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemThemTheThuVienActionPerformed(evt);
            }
        });
        jPopupMenuDocGia.add(jMenuItemThemTheThuVien);

        setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/search.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        jPanel2.add(btnTim);

        btnInExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Export Excel.png"))); // NOI18N
        btnInExcel.setText("In Excel");
        btnInExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInExcelActionPerformed(evt);
            }
        });
        jPanel2.add(btnInExcel);

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/cleaning.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 18, 0, 16);
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPanel6.setLayout(new java.awt.GridLayout(7, 0, 0, 10));

        jLabel1.setText("CCCD");
        jPanel6.add(jLabel1);

        jLabel10.setText("Mã độc giả");
        jPanel6.add(jLabel10);

        jLabel11.setText("Tên độc giả");
        jPanel6.add(jLabel11);

        jLabel2.setText("Phái");
        jPanel6.add(jLabel2);

        jLabel43.setText("Ngày sinh");
        jPanel6.add(jLabel43);

        jLabel12.setText("Số điện thoại");
        jPanel6.add(jLabel12);

        jLabel19.setText("Địa chỉ");
        jPanel6.add(jLabel19);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanel7.add(jPanel6, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridLayout(7, 0, 0, 10));

        tfCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCCCDActionPerformed(evt);
            }
        });
        jPanel5.add(tfCCCD);
        jPanel5.add(tfMaDocGia);
        jPanel5.add(tfTenDocGia);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        buttonGroupPhai.add(jRadioButtonNam);
        jRadioButtonNam.setText("Nam");
        jPanel4.add(jRadioButtonNam);

        buttonGroupPhai.add(jRadioButtonNu);
        jRadioButtonNu.setText("Nữ");
        jPanel4.add(jRadioButtonNu);

        jPanel5.add(jPanel4);
        jPanel5.add(tfNgaySinh);
        jPanel5.add(tfSoDienThoai);
        jPanel5.add(tfDiaChi);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 136;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 55, 6, 6);
        jPanel7.add(jPanel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        jPanel1.add(jPanel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(jPanel1, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 626;
        gridBagConstraints.ipady = 207;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(33, 6, 0, 0);
        add(jScrollPane5, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout());

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setMaximumSize(new java.awt.Dimension(99, 57));
        btnThem.setMinimumSize(new java.awt.Dimension(99, 57));
        btnThem.setPreferredSize(new java.awt.Dimension(99, 57));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel3.add(btnThem);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Delete.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(99, 57));
        btnXoa.setMinimumSize(new java.awt.Dimension(99, 57));
        btnXoa.setPreferredSize(new java.awt.Dimension(99, 57));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoa);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/pen (1).png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(89, 55));
        btnSua.setMinimumSize(new java.awt.Dimension(89, 55));
        btnSua.setPreferredSize(new java.awt.Dimension(99, 57));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua);

        btnLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Refresh.png"))); // NOI18N
        btnLoad.setText("Làm mới");
        btnLoad.setMaximumSize(new java.awt.Dimension(99, 57));
        btnLoad.setMinimumSize(new java.awt.Dimension(99, 57));
        btnLoad.setPreferredSize(new java.awt.Dimension(99, 57));
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        jPanel3.add(btnLoad);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 75, 0, 0);
        add(jPanel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInExcelActionPerformed
        // TODO add your handling code here:
        try{
            JFileChooser fChooser = new JFileChooser();
            int choose = fChooser.showSaveDialog(null);
            if(choose == JFileChooser.APPROVE_OPTION) {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Đọc giả");
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
                cell.setCellValue("Mã đọc giả");

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("Tên đọc giả");

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

                ArrayList<DocGia> arr = docGiaBUS.loadData();

                for(int i = 0; i < arr.size(); i++) {
                    row = sheet.createRow(4 + i);

                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(arr.get(i).getMaDocGia());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(arr.get(i).getTenDocGia());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(arr.get(i).getGioiTinh());

                    cell = row.createCell(4);
                    cell.setCellValue(arr.get(i).getNgaySinh());
                    cell.setCellStyle(style);

                    cell = row.createCell(5, CellType.STRING);
                    cell.setCellValue(arr.get(i).getCCCD());

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

    private void jMenuItemThemTheThuVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemThemTheThuVienActionPerformed
        // TODO add your handling code here:
        int i = tableTTDG.getSelectedRow();
        String str1=null,str2 = null;
        if (i >= 0) {
            str1 = tableTTDG.getModel().getValueAt(i, 2).toString();
            str2 = tableTTDG.getModel().getValueAt(i, 3).toString();
        }
        new thethuvien(str1,str2).setVisible(true);
    }//GEN-LAST:event_jMenuItemThemTheThuVienActionPerformed

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
                    ++i, docGia.getCCCD(), docGia.getMaDocGia(), docGia.getTenDocGia(), docGia.getGioiTinh(),
                    docGia.getNgaySinh(), docGia.getSoDienThoai(), docGia.getDiaChi()
            });
            tableTTDG.setModel(model);
        }
    }

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        refreshData();
    }// GEN-LAST:event_btnLoadActionPerformed

    private void tableTTDGMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableTTDGMouseClicked
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
        jPopupMenuDocGia.show(tableTTDG, evt.getX(), evt.getY());
    }// GEN-LAST:event_tableTTDGMouseClicked

    private void jMenuItemThemTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jMenuItemThemTaiKhoanMouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_jMenuItemThemTaiKhoanMouseClicked

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        try {
            ArrayList<DocGia> arr = new ArrayList<DocGia>();
            String maDocGia = tfMaDocGia.getText();
            String tenDocGia = tfTenDocGia.getText();
            String CCCD = tfCCCD.getText();
            String diaChi = tfDiaChi.getText();
            String ngaySinh = tfNgaySinh.getText();
            String SDT = tfSoDienThoai.getText();
            String gioiTinh = "";
            if (jRadioButtonNam.isSelected())
                gioiTinh += "NAM";
            else
                gioiTinh += "NỮ";

            arr = docGiaBUS.search(maDocGia, tenDocGia, CCCD, gioiTinh, ngaySinh, SDT, diaChi);
            if (arr.size() != 0) {
                JOptionPane.showMessageDialog(this, "Hoàn tất tìm kiếm!");
                model.setRowCount(0);
                int i = 0;
                while (i <= arr.size() - 1) {
                    DocGia docGia = arr.get(i);
                    model.addRow(new Object[] {
                            ++i, docGia.getCCCD(), docGia.getMaDocGia(), docGia.getTenDocGia(), docGia.getGioiTinh(),
                            docGia.getNgaySinh(), docGia.getSoDienThoai(), docGia.getDiaChi()
                    });
                }
            } else
                JOptionPane.showMessageDialog(this, "Không có dữ liệu cần tìm!");
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }// GEN-LAST:event_btnTimActionPerformed

    private void tfCCCDActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tfCCCDActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_tfCCCDActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfCCCD.setText("");
        tfMaDocGia.setText("");
        tfTenDocGia.setText("");
        tfDiaChi.setText("");
        tfSoDienThoai.setText("");
        tfNgaySinh.setText("");
        buttonGroupPhai.clearSelection();

    }// GEN-LAST:event_btnClearActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        try {
            if (tfMaDocGia.getText().trim().equals("") || tfCCCD.getText().trim().equals("")
                    || tfDiaChi.getText().trim().equals("") ||
                    tfTenDocGia.getText().trim().equals("") || tfSoDienThoai.getText().trim().equals("")
                    || tfNgaySinh.getText().trim().equals("")
                    || jRadioButtonNam.isSelected() == false && jRadioButtonNu.isSelected() == false) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");

            } else {
                DocGia docGia = new DocGia();
                docGia.setMaDocGia(tfMaDocGia.getText());
                docGia.setTenDocGia(tfTenDocGia.getText());
                if (jRadioButtonNam.isSelected())
                    docGia.setGioiTinh("NAM");
                else
                    docGia.setGioiTinh("NỮ");
                docGia.setTonTai(true);
                docGia.setCCCD(tfCCCD.getText());
                docGia.setDiaChi(tfDiaChi.getText());
                docGia.setNgaySinh(MenuHand.convert(tfNgaySinh.getText()));
                docGia.setSoDienThoai(tfSoDienThoai.getText());
                docGia.setMaPQ(null);

                JOptionPane.showMessageDialog(this, docGiaBUS.add(docGia));
                model.setRowCount(0);
                refreshData();
            }
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }// GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaActionPerformed
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
    }// GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        ArrayList<DocGia> arr = new ArrayList<DocGia>();
        arr = docGiaBUS.loadData();
        for (DocGia docGia : arr) {
            if (docGia.getMaDocGia().equals(tfMaDocGia.getText().trim())) {
                docGia.setTenDocGia(tfTenDocGia.getText());
                docGia.setDiaChi(tfDiaChi.getText());
                if (jRadioButtonNam.isSelected())
                    docGia.setGioiTinh("NAM");
                else
                    docGia.setGioiTinh("NỮ");
                docGia.setNgaySinh(LocalDate.parse(tfNgaySinh.getText()));
                docGia.setSoDienThoai(tfSoDienThoai.getText());
                JOptionPane.showMessageDialog(this, docGiaBUS.update(docGia));
                break;
            }
        }
        model.setRowCount(0);
        refreshData();
    }// GEN-LAST:event_btnSuaActionPerformed

    private void jMenuItemThemTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItemThemTaiKhoanActionPerformed
        // TODO add your handling code here:
        int i = tableTTDG.getSelectedRow();
        String str = null;
        if (i >= 0) {
            str = tableTTDG.getModel().getValueAt(i, 2).toString();
        }
        ConnectDB connectDB = new ConnectDB();
        boolean success = false;
        try {
            String qry = "SELECT * from taikhoan,phanquyen,docgia WHERE taikhoan.MAPQ=phanquyen.MAPQ and phanquyen.MAPQ = docgia.MAPQ and docgia.MADG='"
                    + str + "'";
            ResultSet rset = connectDB.sqlQuery(qry);
            success = rset.next();
            System.out.println(success);
        } catch (Exception e) {
            // TODO: handle exception
        }
        if (!success) {
            new themtaikhoanKH(str).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại!");
        }

    }// GEN-LAST:event_jMenuItemThemTaiKhoanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnInExcel;
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
    private javax.swing.JMenuItem jMenuItemThemTheThuVien;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
