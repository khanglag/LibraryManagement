/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Object.DocGia;

import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Main {
        public static void main(String[] args) {
                LocalDate localDate = LocalDate.of(2020, 06, 04); // Tạo 1 cái LocalDate
                DocGiaDAO dgdao = new DocGiaDAO();
                for (DocGia itemDocGia : dgdao.timDocGias(null, null, null, null, null, localDate, true))
                        System.out.println(itemDocGia);
        }
}