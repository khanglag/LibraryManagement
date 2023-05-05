/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author khang
 */
public class MenuHand {
    public static LocalDate convert(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = null;
        try {
            localDate = LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            // Xử lý ngoại lệ nếu chuỗi không hợp lệ
            JOptionPane.showMessageDialog(null,"Không thể chuyển đổi chuổi thành LoacalDate"+ e.getMessage()+"\n Chuỗi phải ở dạng: yyyy-MM-dd");
        }
        return localDate;
    }
    public static String FormatString(String str){
        int n = Integer.parseInt(str);
        n= n+1;
        str = String.format("%06d", n);    
        return str;
    }
    public static void main(String[] args) {
        System.out.println(FormatString("10"));
    }
}
