/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.view.employee;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

import com.mycompany.Object.Sach.*;
import java.net.URL;

/**
 *
 * @author khang
 */
public class QuanLySachJPanel extends javax.swing.JPanel {

    
    SachBUS sachBUS = new SachBUS();
    DefaultTableModel model;
    String pathFile;

    /**
     * Creates new form QuanLySachJPanel
     */
    public QuanLySachJPanel() {
        initComponents();
        model = (DefaultTableModel) tableSach.getModel();
        loadData();
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
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

        panelRoot = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfTenSach = new javax.swing.JTextField();
        tfMaSach = new javax.swing.JTextField();
        tfMaNhaXuatBan = new javax.swing.JTextField();
        tfMaTacGia = new javax.swing.JTextField();
        tfLanXuatBan = new javax.swing.JTextField();
        tfSoLuong = new javax.swing.JTextField();
        tfGia = new javax.swing.JTextField();
        btnChonAnhSach = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        lableAnhSach = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfTinhTrang = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfMaTheLoai = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfSoTrang = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSach = new javax.swing.JTable();

        jLabel2.setText("Tên sách");

        jLabel3.setText("Mã sách");

        jLabel4.setText("Mã nhà xuất bản");

        jLabel5.setText("Mã tác giả");

        jLabel6.setText("Chọn ảnh");

        jLabel7.setText("Lần xuất bản");

        jLabel8.setText("Số lượng");

        jLabel9.setText("Giá");

        tfTenSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        tfMaNhaXuatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        btnChonAnhSach.setText("Chọn");
        btnChonAnhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhSachActionPerformed(evt);
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

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        lableAnhSach.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {

            }

            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }

            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setText("Tình trạng");

        jLabel10.setText("Mã thể loại");

        tfMaTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        jLabel11.setText("Số Trang");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnTim.setText("Tim");

        javax.swing.GroupLayout panelRootLayout = new javax.swing.GroupLayout(panelRoot);
        panelRoot.setLayout(panelRootLayout);
        panelRootLayout.setHorizontalGroup(
                panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRootLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btnClear)
                                .addGap(39, 39, 39)
                                .addComponent(btnTim)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelRootLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel5))
                                .addGap(6, 6, 6)
                                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfMaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfMaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel11)
                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(panelRootLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel6))))
                                .addGap(12, 12, 12)
                                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfMaNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 205,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(tfSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(tfLanXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(tfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(tfGia, javax.swing.GroupLayout.PREFERRED_SIZE, 203,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(btnChonAnhSach)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lableAnhSach, javax.swing.GroupLayout.DEFAULT_SIZE, 202,
                                        Short.MAX_VALUE)));
        panelRootLayout.setVerticalGroup(
                panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelRootLayout.createSequentialGroup()
                                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(panelRootLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                                .addGap(4, 4, 4)
                                                                .addComponent(jLabel3)
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel2)
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jLabel1)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jLabel10)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel5))
                                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                                .addComponent(tfMaSach,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(22, 22, 22)
                                                                .addComponent(tfTenSach,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(tfTinhTrang,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(tfMaTheLoai,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(tfMaTacGia,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel4)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jLabel11)
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jLabel7)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(jLabel8)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel9)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jLabel6))
                                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                                .addComponent(tfMaNhaXuatBan,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(tfSoTrang,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(16, 16, 16)
                                                                .addComponent(tfLanXuatBan,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(tfSoLuong,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(tfGia,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(btnChonAnhSach))))
                                        .addGroup(panelRootLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(lableAnhSach, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(9, 9, 9)))
                                .addGap(28, 28, 28)
                                .addGroup(panelRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))));

        tableSach.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "STT", "Mã Sách", "Tên Sách", "Tình Trạng", "Mã Thể Loại", "Mã Tác Giả", "Mã NXB", "Số Trang",
                        "Lần Xuất Bản", "Số Lượng", "Giá", "Ảnh"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tableSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSachMouseClicked(evt);
            }
        });
        tableSach.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {

            }

            public void componentShown(java.awt.event.ComponentEvent evt) {

            }
        });
        jScrollPane1.setViewportView(tableSach);
        if (tableSach.getColumnModel().getColumnCount() > 0) {
            tableSach.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(panelRoot, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelRoot, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    public void loadData() {
        ArrayList<Sach> arr = new ArrayList<Sach>();
        arr = sachBUS.loadData();
        int i = 0;
        while (i <= arr.size() - 1) {
            Sach sach = arr.get(i);
            model.addRow(new Object[] {
                    ++i, sach.getMaSach(), sach.getTenSach(), sach.getTinhTrang(), sach.getMaTheLoai(),
                    sach.getMaTacGia(), sach.getMaNXB(), sach.getSoTrang(), sach.getLanXuatBan(),
                    sach.getSoLuong(), sach.getGia(), sach.getAnh()
            });
            tableSach.setModel(model);
        }
    }

    private void btnChonAnhSachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnChonAnhSachActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            setPathFile(file.getAbsolutePath());
            System.out.println(getPathFile());
            BufferedImage b;
            try {
                b = ImageIO.read(file);
                lableAnhSach.setIcon(new ImageIcon(b));

            } catch (Exception e) {

            }
        }
    }// GEN-LAST:event_btnChonAnhSachActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        ArrayList<Sach> SachList = new ArrayList<Sach>();
        SachList = sachBUS.loadData();
        Sach a = new Sach(tfMaSach.getText(), tfTenSach.getText(), tfTinhTrang.getText(), tfMaTheLoai.getText(),
                tfMaTacGia.getText(), tfMaNhaXuatBan.getText(), Integer.parseInt(tfSoTrang.getText()),
                Integer.parseInt(tfLanXuatBan.getText()),
                Integer.parseInt(tfSoLuong.getText()), Float.parseFloat(tfGia.getText()), getPathFile());
        SachList.add(a);
        int i = SachList.size() - 1;
        Sach sach = SachList.get(i);
        model.addRow(new Object[] {
                ++i, sach.getMaSach(), sach.getTenSach(), sach.getTinhTrang(),
                sach.getMaTheLoai(), sach.getMaTacGia(), sach.getMaNXB(), sach.getSoTrang(), sach.getLanXuatBan(),
                sach.getSoLuong(), sach.getGia(), sach.getAnh()
        });
        tableSach.setModel(model);

    }// GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int i = tableSach.getSelectedRow();
        if (i >= 0) {
            model.removeRow(i);
            tableSach.setModel(model);
        }
    }// GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

        int i = tableSach.getSelectedRow();
        if (i >= 0) {
            model.setValueAt(tfMaSach.getText(), i, 1);
            model.setValueAt(tfTenSach.getText(), i, 2);
            model.setValueAt(tfTinhTrang.getText(), i, 3);
            model.setValueAt(tfMaTheLoai.getText(), i, 4);
            model.setValueAt(tfMaTacGia.getText(), i, 5);
            model.setValueAt(tfMaNhaXuatBan.getText(), i, 6);
            model.setValueAt(tfSoTrang.getText(), i, 7);
            model.setValueAt(tfLanXuatBan.getText(), i, 8);
            model.setValueAt(tfSoLuong.getText(), i, 9);
            model.setValueAt(tfGia.getText(), i, 10);
            model.setValueAt(getPathFile(), i, 11);
        }
        tableSach.setModel(model);
    }// GEN-LAST:event_btnSuaActionPerformed

    private void tableSachMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableSachMouseClicked
        // TODO add your handling code here:
        int i = tableSach.getSelectedRow();
        if (i >= 0) {
            tfMaSach.setText(tableSach.getModel().getValueAt(i, 1).toString());
            tfTenSach.setText(tableSach.getModel().getValueAt(i, 2).toString());
            tfTinhTrang.setText(tableSach.getModel().getValueAt(i, 3).toString());
            tfMaTheLoai.setText(tableSach.getModel().getValueAt(i, 4).toString());
            tfMaTacGia.setText(tableSach.getModel().getValueAt(i, 5).toString());
            tfMaNhaXuatBan.setText(tableSach.getModel().getValueAt(i, 6).toString());
            tfSoTrang.setText(tableSach.getModel().getValueAt(i, 7).toString());
            tfLanXuatBan.setText(tableSach.getModel().getValueAt(i, 8).toString());
            tfSoLuong.setText(tableSach.getModel().getValueAt(i, 9).toString());
            tfGia.setText(tableSach.getModel().getValueAt(i, 10).toString());
            setPathFile(tableSach.getModel().getValueAt(i, 11).toString());
            BufferedImage b;
            try {
                URL url = getClass().getResource(getPathFile());

                // File file = new File(url);
                System.out.println(getPathFile());
                b = ImageIO.read(url);
                lableAnhSach.setIcon(new ImageIcon(b));
            } catch (Exception e) {

            }

        }
    }// GEN-LAST:event_tableSachMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfGia.setText("");
        tfLanXuatBan.setText("");
        tfMaNhaXuatBan.setText("");
        tfMaSach.setText("");
        tfMaTacGia.setText("");
        tfMaTheLoai.setText("");
        tfSoLuong.setText("");
        tfSoTrang.setText("");
        tfTenSach.setText("");
        tfTinhTrang.setText("");
    }// GEN-LAST:event_btnClearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonAnhSach;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lableAnhSach;
    private javax.swing.JPanel panelRoot;
    private javax.swing.JTable tableSach;
    private javax.swing.JTextField tfGia;
    private javax.swing.JTextField tfLanXuatBan;
    private javax.swing.JTextField tfMaNhaXuatBan;
    private javax.swing.JTextField tfMaSach;
    private javax.swing.JTextField tfMaTacGia;
    private javax.swing.JTextField tfMaTheLoai;
    private javax.swing.JTextField tfSoLuong;
    private javax.swing.JTextField tfSoTrang;
    private javax.swing.JTextField tfTenSach;
    private javax.swing.JTextField tfTinhTrang;
    // End of variables declaration//GEN-END:variables

}
