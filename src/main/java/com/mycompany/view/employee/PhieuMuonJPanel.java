/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.employee;

import Menu.MenuHand;
import com.mycompany.Object.DocGia.DocGia;
import com.mycompany.Object.DocGia.DocGiaBUS;
import com.mycompany.Object.NhaXuatBan.NhaXuatBan;
import com.mycompany.Object.NhanVien.NhanVien;
import com.mycompany.Object.NhanVien.NhanVienBUS;
import com.mycompany.Object.PhieuMuon.PhieuMuon;
import com.mycompany.Object.PhieuMuon.PhieuMuonBUS;
import com.mycompany.Object.Sach.Sach;
import com.mycompany.Object.Sach.SachBUS;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author khang
 */
public class PhieuMuonJPanel extends javax.swing.JPanel {
    PhieuMuonBUS phieuMuonBUS = new PhieuMuonBUS();
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupTinhTrang = new javax.swing.ButtonGroup();
        jPanel15 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfMaPhieu = new javax.swing.JTextField();
        jComboBoxMaDocGia = new javax.swing.JComboBox<>();
        jComboBoxMaSach = new javax.swing.JComboBox<>();
        tfNgayMuon = new javax.swing.JTextField();
        jComboBoxMaNhanVien = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        tfSoLuong = new javax.swing.JTextField();
        TfTenDG = new javax.swing.JTextField();
        TfTensach = new javax.swing.JTextField();
        tfNgayTra = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablePhieuMuon = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnInExcel = new javax.swing.JButton();
        Lammoi = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Phiếu mượn"));
        jPanel15.setToolTipText("Phiếu mượn");
        jPanel15.setName("Phiếu mượn"); // NOI18N
        jPanel15.setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridLayout(5, 0, 0, 10));

        jLabel31.setText("Mã phiếu mượn");
        jPanel1.add(jLabel31);

        jLabel32.setText("Mã đọc giả");
        jPanel1.add(jLabel32);

        jLabel36.setText("Mã sách");
        jLabel36.setPreferredSize(new java.awt.Dimension(97, 16));
        jPanel1.add(jLabel36);

        jLabel34.setText("Ngày mượn");
        jPanel1.add(jLabel34);

        jLabel33.setText("Mã nhân viên");
        jPanel1.add(jLabel33);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 17, 11, 0);
        jPanel15.add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridLayout(5, 0, 0, 10));

        tfMaPhieu.setEditable(true);
        tfMaPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaPhieuActionPerformed(evt);
            }
        });
        jPanel2.add(tfMaPhieu);

        jComboBoxMaDocGia.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboBoxMaDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMaDocGiaActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxMaDocGia);

        jComboBoxMaSach.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboBoxMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMaSachActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxMaSach);

        tfNgayMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgayMuonActionPerformed(evt);
            }
        });
        jPanel2.add(tfNgayMuon);

        jComboBoxMaNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>());
        jComboBoxMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMaNhanVienActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxMaNhanVien);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 6, 11, 0);
        jPanel15.add(jPanel2, gridBagConstraints);

        jPanel3.setLayout(new java.awt.GridLayout(4, 0, 0, 10));

        jLabel37.setText("Số lượng");
        jPanel3.add(jLabel37);

        jLabel3.setText("Tên sách");
        jPanel3.add(jLabel3);

        jLabel2.setText("Tên đọc giả");
        jPanel3.add(jLabel2);

        jLabel1.setText("Ngày trả");
        jPanel3.add(jLabel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 6, 0, 0);
        jPanel15.add(jPanel3, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridLayout(4, 0, 0, 10));

        tfSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSoLuongActionPerformed(evt);
            }
        });
        jPanel4.add(tfSoLuong);
        jPanel4.add(TfTenDG);
        jPanel4.add(TfTensach);

        tfNgayTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgayTraActionPerformed(evt);
            }
        });
        jPanel4.add(tfNgayTra);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 18, 0, 0);
        jPanel15.add(jPanel4, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridLayout(2, 0, 0, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(59, 18, 0, 11);
        jPanel15.add(jPanel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = -13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 6);
        add(jPanel15, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 721;
        gridBagConstraints.ipady = 222;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(23, 6, 6, 6);
        add(jScrollPane8, gridBagConstraints);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel6.add(btnThem);

        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(89, 55));
        btnSua.setMinimumSize(new java.awt.Dimension(89, 55));
        btnSua.setPreferredSize(new java.awt.Dimension(99, 57));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel6.add(btnSua);

        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(99, 57));
        btnXoa.setMinimumSize(new java.awt.Dimension(99, 57));
        btnXoa.setPreferredSize(new java.awt.Dimension(99, 57));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel6.add(btnXoa);

        btnInExcel.setText("In Excel");
        btnInExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInExcelActionPerformed(evt);
            }
        });
        jPanel6.add(btnInExcel);

        Lammoi.setText("Làm sạch");
        Lammoi.setMaximumSize(new java.awt.Dimension(99, 57));
        Lammoi.setMinimumSize(new java.awt.Dimension(99, 57));
        Lammoi.setPreferredSize(new java.awt.Dimension(99, 57));
        Lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LammoiActionPerformed(evt);
            }
        });
        jPanel6.add(Lammoi);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 140, 0, 0);
        add(jPanel6, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
             PhieuMuon pm= new PhieuMuon();
             PhieuMuonBUS pmbus=new PhieuMuonBUS();
             pm.setMaPhieu((Integer.parseInt(tfMaPhieu.getText())-1)+"");
             pm.setMaDocGia(jComboBoxMaDocGia. getSelectedItem().toString());
             pm.setMaNhanVien(jComboBoxMaNhanVien.getSelectedItem().toString());
             pm.setMaSach(jComboBoxMaSach.getSelectedItem().toString());
             pm.setNgayMuon(LocalDate.now());
             pm.setNgayTra(MenuHand.convert(tfNgayTra.getText()));
             pm.setSoLuong(Integer.parseInt(tfSoLuong.getText()));
             pm.setTonTai(1);
             pmbus.update(pm);
        System.out.println(pm.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Không được để trống trường");
        }
        showtable();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void jComboBoxMaDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMaDocGiaActionPerformed
        if (jComboBoxMaDocGia.getSelectedItem()!=null) {
             String ten=jComboBoxMaDocGia.getSelectedItem().toString();
        DocGiaBUS dgbus=new DocGiaBUS();
        for(DocGia itemDocGia:dgbus.search(ten, "", "", "", "", "", "")){
            TfTenDG.setText(itemDocGia.getTenDocGia());
        }
        }
       
            
        
    }//GEN-LAST:event_jComboBoxMaDocGiaActionPerformed

    private void tfNgayTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgayTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgayTraActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
             boolean muonduoc=true;
             PhieuMuon pm= new PhieuMuon();
             PhieuMuonBUS pmbus=new PhieuMuonBUS();
             pm.setMaPhieu(Menu.MenuHand.FormatString(pmbus.getMaphieumuon()));
             pm.setMaDocGia(jComboBoxMaDocGia. getSelectedItem().toString());
             pm.setMaNhanVien(jComboBoxMaNhanVien.getSelectedItem().toString());
             pm.setMaSach(jComboBoxMaSach.getSelectedItem().toString());
             pm.setNgayMuon(LocalDate.now());
             pm.setNgayTra(MenuHand.convert(tfNgayTra.getText()));
             if(pm.getNgayMuon().isAfter(pm.getNgayTra())){
                 JOptionPane.showMessageDialog(null,"Số ngày mượn phải lớn hơn 0");
                 muonduoc=false;
             }
             pm.setTonTai(1);
             if (Integer.parseInt(tfSoLuong.getText())<=0) {
                JOptionPane.showMessageDialog(null,"Số lượng phải lớn hơn 0");
            }else{
                 pm.setSoLuong(Integer.parseInt(tfSoLuong.getText()));
             }
             if (muonduoc) {
                pmbus.them(pm);
            }else JOptionPane.showMessageDialog(null,"Không mượn được");
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
        try {
             PhieuMuon pm= new PhieuMuon();
             PhieuMuonBUS pmbus=new PhieuMuonBUS();
             pm.setMaPhieu((Integer.parseInt(tfMaPhieu.getText())-1)+"");
             pm.setMaDocGia(jComboBoxMaDocGia. getSelectedItem().toString());
             pm.setMaNhanVien(jComboBoxMaNhanVien.getSelectedItem().toString());
             pm.setMaSach(jComboBoxMaSach.getSelectedItem().toString());
             pm.setNgayMuon(LocalDate.now());
             pm.setNgayTra(MenuHand.convert(tfNgayTra.getText()));
             pm.setSoLuong(Integer.parseInt(tfSoLuong.getText()));
             pm.setTonTai(1);
             pmbus.xoa(pm);
        System.out.println(pm.toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Không được để trống trường");
        }
        showtable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jComboBoxMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMaSachActionPerformed
        if (jComboBoxMaSach.getSelectedItem()!=null) {
            String maphieu=jComboBoxMaSach.getSelectedItem().toString();
        SachBUS sbus= new SachBUS();
        for(Sach iSach:sbus.search(maphieu, "", "", "", "", "", "", "", "", "")){
            TfTensach.setText(iSach.getTenSach());
        }
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
            jComboBoxMaSach.removeAllItems();
            jComboBoxMaDocGia.removeAllItems();   
            DocGiaBUS gdBUS =new DocGiaBUS();
            SachBUS sabus=new SachBUS();
            String tendg = "", tensach="";
            for(DocGia itemDocGia:gdBUS.search(tablePhieuMuon.getModel().getValueAt(select, 2).toString(), "", "","", "", "", "")){
                 tendg=itemDocGia.getTenDocGia();
                 System.out.println("Tendg"+tablePhieuMuon.getModel().getValueAt(select, 2).toString());
                 System.out.println(tendg);
            }
            for(Sach itemSach:sabus.search(tablePhieuMuon.getModel().getValueAt(select, 3).toString(), "", "", "", "","", "", "", "", "")){
                 tensach=itemSach.getTenSach();
                 System.out.println(tensach);
            }
            tfMaPhieu.setText(tablePhieuMuon.getModel().getValueAt(select, 1).toString());
            TfTenDG.setText(tendg);
            TfTensach.setText(tensach);
            tfNgayMuon.setText(tablePhieuMuon.getModel().getValueAt(select, 5).toString());
            tfNgayTra.setText(tablePhieuMuon.getModel().getValueAt(select, 6).toString());
            tfSoLuong.setText(tablePhieuMuon.getModel().getValueAt(select, 7).toString());
                for(DocGia itempDocGia: gdBUS.search("",tendg, "", "", "", "", "")){
                     jComboBoxMaDocGia.addItem(itempDocGia.getMaDocGia());
                }
                for(Sach itemsa: sabus.search("", tensach, "", "", "", "", "", "", "", "")){
                    jComboBoxMaSach.addItem(itemsa.getMaSach());
                }
        }
    }//GEN-LAST:event_tablePhieuMuonMouseClicked

    private void tfSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSoLuongActionPerformed

    private void LammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LammoiActionPerformed
        clear();
        showcombodataDT();
    }//GEN-LAST:event_LammoiActionPerformed

    private void btnInExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInExcelActionPerformed
        // TODO add your handling code here:
        try{
            JFileChooser fChooser = new JFileChooser();
            int choose = fChooser.showSaveDialog(null);
            if(choose == JFileChooser.APPROVE_OPTION) {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Phiếu mượn");
                XSSFRow row = null;
                Cell cell = null;
                row = sheet.createRow(3);

                String dateFormat = "yyyy-MM-dd";
                CellStyle style = workbook.createCellStyle();
                DataFormat dataFormat = workbook.createDataFormat();
                style.setDataFormat(dataFormat.getFormat(dateFormat));

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue("STT");

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue("Mã phiếu mượn");

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue("Mã độc giả");

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue("Mã sách");

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue("Mã nhân viên");

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue("Ngày mượn");

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue("Hạn trả");

                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue("Số lượng");

                cell = row.createCell(8, CellType.STRING);
                cell.setCellValue("Tình trạng");

                ArrayList<PhieuMuon> arr = phieuMuonBUS.loadData();

                for(int i = 0; i < arr.size(); i++) {
                    row = sheet.createRow(4 + i);

                    cell = row.createCell(0, CellType.NUMERIC);
                    cell.setCellValue(i + 1);

                    cell = row.createCell(1, CellType.STRING);
                    cell.setCellValue(arr.get(i).getMaPhieu());

                    cell = row.createCell(2, CellType.STRING);
                    cell.setCellValue(arr.get(i).getMaDocGia());

                    cell = row.createCell(3, CellType.STRING);
                    cell.setCellValue(arr.get(i).getMaSach());

                    cell = row.createCell(4, CellType.STRING);
                    cell.setCellValue(arr.get(i).getMaNhanVien());

                    cell = row.createCell(5);
                    cell.setCellValue(arr.get(i).getNgayMuon());
                    cell.setCellStyle(style);    
                    
                    cell = row.createCell(6);
                    cell.setCellValue(arr.get(i).getNgayTra());
                    cell.setCellStyle(style);    

                    cell = row.createCell(7, CellType.NUMERIC);
                    cell.setCellValue(arr.get(i).getSoLuong());

                    cell = row.createCell(8, CellType.NUMERIC);
                    cell.setCellValue(arr.get(i).isTonTai());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lammoi;
    private javax.swing.JTextField TfTenDG;
    private javax.swing.JTextField TfTensach;
    private javax.swing.JButton btnInExcel;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
        int i =0;
        for(PhieuMuon itMuon:pmbus.loadData()){
            if (itMuon.isTonTai()==1) {
               Object[] rowData={++i,MenuHand.FormatString(itMuon.getMaPhieu()),itMuon.getMaDocGia(),itMuon.getMaSach(),itMuon.getMaNhanVien(),MenuHand.convert(itMuon.getNgayMuon()),MenuHand.convert(itMuon.getNgayTra()),itMuon.getSoLuong(),itMuon.isTonTai()};
            model.addRow(rowData); 
            }      
        }
    }
    public void clear(){
        TfTenDG.setText("");
        TfTensach.setText("");
        tfNgayMuon.setText("");
        tfNgayTra.setText("");
        tfSoLuong.setText("");
        tfMaPhieu.setText("");
        jComboBoxMaDocGia.removeAllItems();
        jComboBoxMaSach.removeAllItems();
    }
}
