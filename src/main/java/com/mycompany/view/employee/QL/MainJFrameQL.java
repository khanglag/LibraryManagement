/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view.employee.QL;

import com.mycompany.bean.DanhMucBean;
import com.mycompany.controller.ChuyenManHinhControllerQL;
import com.mycompany.view.DangNhapJDialog;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author khang
 */
public class MainJFrameQL extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrameQL
     */
    public MainJFrameQL() {
        initComponents();
        TrinhDieuKhien();
        
    }
    private void TrinhDieuKhien(){
        ChuyenManHinhControllerQL controller = new ChuyenManHinhControllerQL(jpnView);
        controller.setView(jpnTrangChu, jlbTrangChu);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChinh",jpnTrangChu,jlbTrangChu));
        listItem.add(new DanhMucBean("QuanLyMuon",jpnQuanLyMuon,jlbQuanLyMuon));
        listItem.add(new DanhMucBean("Sach",jpnSach,jlbSach));
        listItem.add(new DanhMucBean("ThongTinTaiKhoan",jpnThongTinTaiKhoan,jlbThongTinTaiKhoan));
        listItem.add(new DanhMucBean("TacGia",jpnTacGia,jlbTacGia));
        listItem.add(new DanhMucBean("ThongKe",jpnThongKe,jlbThongKe));
        listItem.add(new DanhMucBean("NhaXuatBan",jpnNhaXuatBan,jlbNhaXuaBan));
        
        listItem.add(new DanhMucBean("PhieuMuon",jpnPhieuMuon,jlbPhieuMuon));
        listItem.add(new DanhMucBean("PhieuNhap",jpnPhieuNhap,jlbPhieuNhap));
        listItem.add(new DanhMucBean("NhanVien",jpnNhanVien,jlbNhanVien));
        listItem.add(new DanhMucBean("DocGia",jpnDocGia,jlbDocGia));
        
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
        jpnView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpnMenu = new javax.swing.JPanel();
        jpnTrangChu = new javax.swing.JPanel();
        jlbTrangChu = new javax.swing.JLabel();
        jpnSach = new javax.swing.JPanel();
        jlbSach = new javax.swing.JLabel();
        jpnDocGia = new javax.swing.JPanel();
        jlbDocGia = new javax.swing.JLabel();
        jpnTacGia = new javax.swing.JPanel();
        jlbTacGia = new javax.swing.JLabel();
        jpnNhaXuatBan = new javax.swing.JPanel();
        jlbNhaXuaBan = new javax.swing.JLabel();
        jpnPhieuMuon = new javax.swing.JPanel();
        jlbPhieuMuon = new javax.swing.JLabel();
        jpnPhieuNhap = new javax.swing.JPanel();
        jlbPhieuNhap = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        jlbThongKe = new javax.swing.JLabel();
        jpnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new javax.swing.JLabel();
        jpnThongTinTaiKhoan = new javax.swing.JPanel();
        jlbThongTinTaiKhoan = new javax.swing.JLabel();
        jpnQuanLyMuon = new javax.swing.JPanel();
        jlbQuanLyMuon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(51, 51, 51));

        jpnView.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        jpnMenu.setBackground(new java.awt.Color(51, 51, 51));

        jpnTrangChu.setBackground(new java.awt.Color(51, 51, 51));

        jlbTrangChu.setBackground(new java.awt.Color(51, 51, 51));
        jlbTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jlbTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/icons8-home-page-50.png"))); // NOI18N
        jlbTrangChu.setText("Trang chủ");

        javax.swing.GroupLayout jpnTrangChuLayout = new javax.swing.GroupLayout(jpnTrangChu);
        jpnTrangChu.setLayout(jpnTrangChuLayout);
        jpnTrangChuLayout.setHorizontalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTrangChuLayout.setVerticalGroup(
            jpnTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnSach.setBackground(new java.awt.Color(51, 51, 51));

        jlbSach.setForeground(new java.awt.Color(255, 255, 255));
        jlbSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/bookicon.png"))); // NOI18N
        jlbSach.setText("Sách");

        javax.swing.GroupLayout jpnSachLayout = new javax.swing.GroupLayout(jpnSach);
        jpnSach.setLayout(jpnSachLayout);
        jpnSachLayout.setHorizontalGroup(
            jpnSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnSachLayout.setVerticalGroup(
            jpnSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbSach, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnDocGia.setBackground(new java.awt.Color(51, 51, 51));

        jlbDocGia.setForeground(new java.awt.Color(255, 255, 255));
        jlbDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/icons8-reader-64.png"))); // NOI18N
        jlbDocGia.setText("Đọc giả");

        javax.swing.GroupLayout jpnDocGiaLayout = new javax.swing.GroupLayout(jpnDocGia);
        jpnDocGia.setLayout(jpnDocGiaLayout);
        jpnDocGiaLayout.setHorizontalGroup(
            jpnDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDocGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnDocGiaLayout.setVerticalGroup(
            jpnDocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDocGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnTacGia.setBackground(new java.awt.Color(51, 51, 51));

        jlbTacGia.setForeground(new java.awt.Color(255, 255, 255));
        jlbTacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Tacgia.png"))); // NOI18N
        jlbTacGia.setText("Tác giả");

        javax.swing.GroupLayout jpnTacGiaLayout = new javax.swing.GroupLayout(jpnTacGia);
        jpnTacGia.setLayout(jpnTacGiaLayout);
        jpnTacGiaLayout.setHorizontalGroup(
            jpnTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTacGiaLayout.setVerticalGroup(
            jpnTacGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTacGiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnNhaXuatBan.setBackground(new java.awt.Color(51, 51, 51));

        jlbNhaXuaBan.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhaXuaBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/nhaxuatban.png"))); // NOI18N
        jlbNhaXuaBan.setText("Nhà xuất bản");

        javax.swing.GroupLayout jpnNhaXuatBanLayout = new javax.swing.GroupLayout(jpnNhaXuatBan);
        jpnNhaXuatBan.setLayout(jpnNhaXuatBanLayout);
        jpnNhaXuatBanLayout.setHorizontalGroup(
            jpnNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhaXuatBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhaXuaBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnNhaXuatBanLayout.setVerticalGroup(
            jpnNhaXuatBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhaXuatBanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhaXuaBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnPhieuMuon.setBackground(new java.awt.Color(51, 51, 51));

        jlbPhieuMuon.setForeground(new java.awt.Color(255, 255, 255));
        jlbPhieuMuon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Note.png"))); // NOI18N
        jlbPhieuMuon.setText("Phiếu mượn");

        javax.swing.GroupLayout jpnPhieuMuonLayout = new javax.swing.GroupLayout(jpnPhieuMuon);
        jpnPhieuMuon.setLayout(jpnPhieuMuonLayout);
        jpnPhieuMuonLayout.setHorizontalGroup(
            jpnPhieuMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPhieuMuonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPhieuMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnPhieuMuonLayout.setVerticalGroup(
            jpnPhieuMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPhieuMuonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPhieuMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnPhieuNhap.setBackground(new java.awt.Color(51, 51, 51));

        jlbPhieuNhap.setForeground(new java.awt.Color(255, 255, 255));
        jlbPhieuNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/phieunhap.png"))); // NOI18N
        jlbPhieuNhap.setText("Phiếu nhập");

        javax.swing.GroupLayout jpnPhieuNhapLayout = new javax.swing.GroupLayout(jpnPhieuNhap);
        jpnPhieuNhap.setLayout(jpnPhieuNhapLayout);
        jpnPhieuNhapLayout.setHorizontalGroup(
            jpnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnPhieuNhapLayout.setVerticalGroup(
            jpnPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThongKe.setBackground(new java.awt.Color(51, 51, 51));

        jlbThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Combo Chart.png"))); // NOI18N
        jlbThongKe.setText("Thống kê");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnNhanVien.setBackground(new java.awt.Color(51, 51, 51));

        jlbNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/Staff.png"))); // NOI18N
        jlbNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnNhanVienLayout.setVerticalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThongTinTaiKhoan.setBackground(new java.awt.Color(51, 51, 51));

        jlbThongTinTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongTinTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/user.png"))); // NOI18N
        jlbThongTinTaiKhoan.setText("Thông tin tài khoản");

        javax.swing.GroupLayout jpnThongTinTaiKhoanLayout = new javax.swing.GroupLayout(jpnThongTinTaiKhoan);
        jpnThongTinTaiKhoan.setLayout(jpnThongTinTaiKhoanLayout);
        jpnThongTinTaiKhoanLayout.setHorizontalGroup(
            jpnThongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinTaiKhoanLayout.createSequentialGroup()
                .addComponent(jlbThongTinTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThongTinTaiKhoanLayout.setVerticalGroup(
            jpnThongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnQuanLyMuon.setBackground(new java.awt.Color(51, 51, 51));

        jlbQuanLyMuon.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyMuon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/list1.png"))); // NOI18N
        jlbQuanLyMuon.setText("Quản Lý Mượn");

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
                .addComponent(jlbQuanLyMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                    .addComponent(jpnTrangChu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnSach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDocGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTacGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnNhaXuatBan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnQuanLyMuon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnPhieuMuon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpnPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpnThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnThongTinTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnPhieuMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jpnMenu);

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbDocGia;
    private javax.swing.JLabel jlbNhaXuaBan;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbPhieuMuon;
    private javax.swing.JLabel jlbPhieuNhap;
    private javax.swing.JLabel jlbQuanLyMuon;
    private javax.swing.JLabel jlbSach;
    private javax.swing.JLabel jlbTacGia;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JLabel jlbThongTinTaiKhoan;
    private javax.swing.JLabel jlbTrangChu;
    private javax.swing.JPanel jpnDocGia;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnNhaXuatBan;
    private javax.swing.JPanel jpnNhanVien;
    private javax.swing.JPanel jpnPhieuMuon;
    private javax.swing.JPanel jpnPhieuNhap;
    private javax.swing.JPanel jpnQuanLyMuon;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnSach;
    private javax.swing.JPanel jpnTacGia;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnThongTinTaiKhoan;
    private javax.swing.JPanel jpnTrangChu;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
