/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReadWriteFile;

import com.mysql.cj.result.Row;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author khang
 */
public class ReadFileExcel {
    public void ReadFile(){
        try{
                XSSFWorkbook wb=null;
                FileInputStream fileIn=null;
                JFileChooser choose=new JFileChooser();
                int excelchoose=choose.showSaveDialog(null);
                if(excelchoose==JFileChooser.APPROVE_OPTION){
                    File fl=choose.getSelectedFile();
                    fileIn=new FileInputStream(fl);
                    wb=new XSSFWorkbook(fileIn);
                    XSSFSheet sheet=wb.getSheetAt(0);
                    Row row;
                    for(int i=1;i<=sheet.getLastRowNum();i++){
                        row=(Row) sheet.getRow(i);
                       
                    }
                }
               
                JOptionPane.showMessageDialog(null, "Data import Success");
                wb.close();
            }catch (Exception u){
                u.printStackTrace();
                JOptionPane.showMessageDialog(null, "Data import False");
            }
    }
}
