/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.Object.TaiKhoan;
import com.mycompany.Service.TaiKhoanService;
import com.mycompany.Service.TaiKhoanServiceImpl;
import com.mycompany.view.employee.QL.MainJFrameQL;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author khang
 */
public class TaiKhoanController {
    
    private Dialog dialog;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap,jtfMatKhau;
    private JLabel jlbMsg;
    
    private TaiKhoanService taiKhoanService=null;
    

    public TaiKhoanController(Dialog dialog, JButton btnSubmit, JTextField jtfTenDangNhap, JTextField jtfMatKhau, JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnSubmit = btnSubmit;
        this.jtfTenDangNhap = jtfTenDangNhap;
        this.jtfMatKhau = jtfMatKhau;
        this.jlbMsg = jlbMsg;
        
        taiKhoanService = new TaiKhoanServiceImpl();
    }
    
    public void setEvent(){
        btnSubmit.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(jtfTenDangNhap.getText().length()==0 || jtfMatKhau.getText().length()==0){
                    jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc");
                }else{
                    TaiKhoan taiKhoan = taiKhoanService.login(jtfTenDangNhap.getText(), jtfMatKhau.getText());
                    if(taiKhoan==null){
                        jlbMsg.setText("Tên đăng nhập hoặc mật khẩu không chính xác");
                    }else{
                        if(taiKhoan.isTonTai()==false){
                            jlbMsg.setText("Tài khoản bị khoá");
                        }else{
                            dialog.dispose();
                            MainJFrameQL frameQL= new MainJFrameQL();
                            frameQL.setTitle("Quản lý thư viện");
                            frameQL.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            frameQL.setVisible(true);
                        }
                    }
                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
          
            }

            @Override
            public void mouseExited(MouseEvent e) {
          
            }
        });
    }
    
    
}
