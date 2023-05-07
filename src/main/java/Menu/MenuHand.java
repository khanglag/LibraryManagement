/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author khang
 */
public class MenuHand {
    public static LocalDate convert(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = null;
        try {
            localDate = LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            // Xử lý ngoại lệ nếu chuỗi không hợp lệ
            JOptionPane.showMessageDialog(null, "Không thể chuyển đổi chuổi thành LoacalDate" + e.getMessage()
                    + "\n Chuỗi phải ở dạng: yyyy-MM-dd");
        }
        return localDate;
    }

    public static String FormatString(String str) {
        if (str.equals(""))
            str = "0";
        int n = Integer.parseInt(str);
        n = n + 1;
        str = String.format("%06d", n);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(FormatString(""));
    }

    public static LocalDate convert(java.sql.Date date) {
        LocalDate d;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ZoneId defaultZoneId = ZoneId.systemDefault();
        if (date == null)
            return LocalDate.parse("1970-01-01", formatter);
        else
            d = date.toInstant().atZone(defaultZoneId).toLocalDate();
        return d;
    }
    public static int TruDate(LocalDate date1, LocalDate date2) {
        long diffDays = ChronoUnit.DAYS.between(date1, date2);
        int diffDaysInt = (int) diffDays;
        return diffDaysInt;
    }
}
