/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view.KH;

import com.mycompany.bean.DanhMucBean;
import com.mycompany.controller.ChuyenManHinhControllerKH;
import java.util.ArrayList;
import java.util.List;

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
        controller.setView(jpnQuanLyMuon, jlbQuanLyMuon);
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
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(0, 0, 0));

        jpnMenu.setBackground(new java.awt.Color(102, 102, 102));

        jlbTrangChinh.setText("jLabel1");

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

        jlbThongTinTaiKhoan.setText("Thông tin tài khoản");

        javax.swing.GroupLayout jpnThongTinTaiKhoanLayout = new javax.swing.GroupLayout(jpnThongTinTaiKhoan);
        jpnThongTinTaiKhoan.setLayout(jpnThongTinTaiKhoanLayout);
        jpnThongTinTaiKhoanLayout.setHorizontalGroup(
            jpnThongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongTinTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThongTinTaiKhoanLayout.setVerticalGroup(
            jpnThongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongTinTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTrangChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnQuanLyMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnQuanLyTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnThongTinTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(0, 308, Short.MAX_VALUE))
        );

        jpnView.setBackground(new java.awt.Color(204, 255, 204));

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

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
