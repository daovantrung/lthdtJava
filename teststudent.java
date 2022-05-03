/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lthdt.chuong2.employeelogic.Student;

/**
 *
 * @author macbookair
 */
public class teststudent {
    public static void main(String[]args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy", Locale.ENGLISH);
        String input = "12-12-1999";
        Date ngaysinh = df.parse(input);
        
        Student obj = new  Student("Kinh Tế ", "Xuất Sắc","Nguyễn Văn A",1,ngaysinh);
      switch(obj.getHocluc()){
          case "Xuất Sắc":
          obj.setHocbong(1000);
          break;
          case "Gioi":
          obj.setHocbong(855.5);
          break;
          default:
             obj.setHocbong(0);
             break;
      }
              
        System.out.println(obj);
    }
}
