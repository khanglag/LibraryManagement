/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Service;

import com.mycompany.Object.TaiKhoan;
import com.mycompany.dao.TaiKhoanDAO;
import com.mycompany.dao.TaiKhoanDAOImpl;

/**
 *
 * @author khang
 */
public class TaiKhoanServiceImpl implements TaiKhoanService{

    private TaiKhoanDAO taiKhoanDAO = null;

    public TaiKhoanServiceImpl() {
        taiKhoanDAO = new TaiKhoanDAOImpl();
    }

    @Override
    public TaiKhoan login(String tenDangNhap, String matKhau) {
        return taiKhoanDAO.login(tenDangNhap, matKhau);
    }
    
}
