/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagement;

import com.mycompany.view.DangNhapJDialog;

/**
 *
 * @author khang
 */
public class LibraryManagement {

    public static void main(String[] args) {
        // new MainJFrameKH().setVisible(true);
        // new MainJFrameQL().setVisible(true);
        DangNhapJDialog jDialog = new DangNhapJDialog(null, true);
        jDialog.setTitle("Đăng nhập hệ thống");
        jDialog.setResizable(false);
        jDialog.setLocationRelativeTo(null);
        jDialog.setVisible(true);
    }
}
