/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.itextpdf.text.pdf.PdfName;
import com.mycompany.Object.TaiKhoan;
import com.mycompany.Service.TaiKhoanService;
import com.mycompany.Service.TaiKhoanServiceImpl;
import com.mycompany.view.KH.MainJFrameKH;
import com.mycompany.view.employee.QL.MainJFrameQL;
import com.mycompany.view.employee.TT.MainJFrameTT;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author khang
 */
//chức năng login
public class TaiKhoanController {
    
    private Dialog dialog;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap;
    private JPasswordField jtfMatKhau;
    private JLabel jlbMsg;
    
    static String tendnString=null;
    static int ngdn;
    
    private JFrame frame=null;
    private TaiKhoanService taiKhoanService=null;

    public TaiKhoanController(Dialog dialog, JButton btnSubmit, JTextField jtfTenDangNhap, JPasswordField jtfMatKhau, JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnSubmit = btnSubmit;
        this.jtfTenDangNhap = jtfTenDangNhap;
        this.jtfMatKhau = jtfMatKhau;
        this.jlbMsg = jlbMsg;
        
        
        taiKhoanService = new TaiKhoanServiceImpl();
    }

    public static void setNgdn(int ngdn) {
        TaiKhoanController.ngdn = ngdn;
    }

    public static String getTendnString() {
        return tendnString;
    }

    public static int getNgdn() {
        return ngdn;
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
                        if(!taiKhoan.isTonTai()){
                            jlbMsg.setText("Tài khoản bị khoá");
                        }else{
                            tendnString=jtfTenDangNhap.getText();
                            
                            if(taiKhoan.getQuyen().contains("QL")){
                                setNgdn(0);
                                dialog.dispose();
                                frame= new MainJFrameQL();
                                frame.setTitle("Quản lý thư viện");
                                frame.setExtendedState(JFrame.ABORT);
                                frame.setVisible(true);    
                                
                            }else if(taiKhoan.getQuyen().contains("TT")){
                                setNgdn(0);
                                dialog.dispose();
                                frame= new MainJFrameTT();
                                frame.setTitle("Quản lý thư viện");
                                frame.setExtendedState(JFrame.ABORT);
                                frame.setVisible(true);
                            }else{
                                setNgdn(1);
                                dialog.dispose();
                                frame = new MainJFrameKH();
                                frame.setTitle("Quản lý thư viện");
                                frame.setExtendedState(JFrame.ABORT);
                                frame.setVisible(true);
                            }
                            
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
