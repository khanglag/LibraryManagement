/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view.KH;

import com.mycompany.bean.DanhMucBean;
import com.mycompany.controller.ChuyenManHinhControllerKH;
import com.mycompany.view.DangNhapJDialog;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author khang
 */
public class MainJFrameKH extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrameKH
     */
    public MainJFrameKH() {
        initComponents();
        ChuyenManHinhControllerKH controller = new ChuyenManHinhControllerKH(jpnView);
        //controller.setView(jpnQuanLyMuon, jlbQuanLyMuon);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChinh",jpnTrangChinh,jlbTrangChinh));
        listItem.add(new DanhMucBean("QuanLyMuon",jpnQuanLyMuon,jlbQuanLyMuon));
        listItem.add(new DanhMucBean("QuanLyTra",jpnQuanLyTra,jlbQuanLyTra));
        listItem.add(new DanhMucBean("ThongTinTaiKhoan",jpnThongTinTaiKhoan,jlbThongTinTaiKhoan));
        
        controller.setEvent(listItem);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnTrangChinh = new javax.swing.JPanel();
        jlbTrangChinh = new javax.swing.JLabel();
        jpnQuanLyMuon = new javax.swing.JPanel();
        jlbQuanLyMuon = new javax.swing.JLabel();
        jpnQuanLyTra = new javax.swing.JPanel();
        jlbQuanLyTra = new javax.swing.JLabel();
        jpnThongTinTaiKhoan = new javax.swing.JPanel();
        jlbThongTinTaiKhoan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(51, 51, 51));

        jpnMenu.setBackground(new java.awt.Color(51, 51, 51));

        jpnTrangChinh.setBackground(new java.awt.Color(51, 51, 51));

        jlbTrangChinh.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChinh.setText("Trang chủ");

        javax.swing.GroupLayout jpnTrangChinhLayout = new javax.swing.GroupLayout(jpnTrangChinh);
        jpnTrangChinh.setLayout(jpnTrangChinhLayout);
        jpnTrangChinhLayout.setHorizontalGroup(
            jpnTrangChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTrangChinhLayout.setVerticalGroup(
            jpnTrangChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChinh, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnQuanLyMuon.setBackground(new java.awt.Color(51, 51, 51));

        jlbQuanLyMuon.setBackground(new java.awt.Color(255, 255, 255));
        jlbQuanLyMuon.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyMuon.setText("Quản lý mượn");

        javax.swing.GroupLayout jpnQuanLyMuonLayout = new javax.swing.GroupLayout(jpnQuanLyMuon);
        jpnQuanLyMuon.setLayout(jpnQuanLyMuonLayout);
        jpnQuanLyMuonLayout.setHorizontalGroup(
            jpnQuanLyMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyMuonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuanLyMuonLayout.setVerticalGroup(
            jpnQuanLyMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyMuonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnQuanLyTra.setBackground(new java.awt.Color(51, 51, 51));

        jlbQuanLyTra.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyTra.setText("Quản lý trả");

        javax.swing.GroupLayout jpnQuanLyTraLayout = new javax.swing.GroupLayout(jpnQuanLyTra);
        jpnQuanLyTra.setLayout(jpnQuanLyTraLayout);
        jpnQuanLyTraLayout.setHorizontalGroup(
            jpnQuanLyTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyTraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnQuanLyTraLayout.setVerticalGroup(
            jpnQuanLyTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyTraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyTra, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThongTinTaiKhoan.setBackground(new java.awt.Color(51, 51, 51));

        jlbThongTinTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongTinTaiKhoan.setText("Thông tin tài khoản");

        javax.swing.GroupLayout jpnThongTinTaiKhoanLayout = new javax.swing.GroupLayout(jpnThongTinTaiKhoan);
        jpnThongTinTaiKhoan.setLayout(jpnThongTinTaiKhoanLayout);
        jpnThongTinTaiKhoanLayout.setHorizontalGroup(
            jpnThongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnThongTinTaiKhoanLayout.setVerticalGroup(
            jpnThongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongTinTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btnDangXuat.setBackground(new java.awt.Color(51, 51, 51));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.setPreferredSize(new java.awt.Dimension(250, 50));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpnTrangChinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnQuanLyMuon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnQuanLyTra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongTinTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnTrangChinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 232, Short.MAX_VALUE))
        );

        jpnView.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 741, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        logout();
        
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void logout() {
        int reply = JOptionPane.showConfirmDialog(getRootPane(),
                "Bạn có chắc muốn đăng xuất ?" , "Chú ý",
                JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            this.dispose();
            DangNhapJDialog.login();
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbQuanLyMuon;
    private javax.swing.JLabel jlbQuanLyTra;
    private javax.swing.JLabel jlbThongTinTaiKhoan;
    private javax.swing.JLabel jlbTrangChinh;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQuanLyMuon;
    private javax.swing.JPanel jpnQuanLyTra;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnThongTinTaiKhoan;
    private javax.swing.JPanel jpnTrangChinh;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
