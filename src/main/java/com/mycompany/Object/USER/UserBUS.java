/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.USER;

import java.util.ArrayList;

/**
 *
 * @author khang
 */
public class UserBUS {
    ArrayList<User> dsUser = new ArrayList<>();
    UserDAO userDAO = new UserDAO();

    public UserBUS() {
        dsUser = userDAO.readDB();
    }

    public ArrayList<User> getUsers() {
        return dsUser;
    }

    public String updateUser(User user) {
        if (userDAO.updateUser(user)) {
            return "Sửa thành công";

        }
        return "Thất bại";
    }

    public String changePasswordUser(User user) {
        if (userDAO.changePassword(user)) {
            return "Sửa thành công";

        }
        return "Thất bại";
    }

}
