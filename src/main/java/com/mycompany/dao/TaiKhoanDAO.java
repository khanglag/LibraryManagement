/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.Object.TaiKhoan;

/**
 *
 * @author khang
 */
public interface TaiKhoanDAO {

    /**
     *
     * @param tenDangNhap
     * @param matKhau
     * @return
     */

    public TaiKhoan login(String tenDangNhap, String matKhau);
    
}
