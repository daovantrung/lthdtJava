/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author macbookair
 */
public class Bai6 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyen van A", 1 ,ngaysinh);
        
        System.out.println("Hoten:"+person.getHoten() + "; gioitinh: "
        + person.getGioitinh() + "; ngaysinh: " +
                df.format(person.getNgaysinh()));
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyen van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-12-2002"));
        sinhvien.setTruonghoc("Kinh te hue");
        
        System.out.println(sinhvien.getHoten() + "; gioitinh " +
                sinhvien.getGioitinh() +
                "; ngaysinh: " +df.format(sinhvien.getNgaysinh())
        + "; "+ sinhvien.getTruonghoc());
        
        System.out.println(sinhvien.calctax(1200));
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Nguyen Văn C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("02-09-2003"));
        congnhan.setCongty("HBT");
        System.out.println(congnhan.getHoten()+"; gioitinh:"+
                congnhan.getGioitinh()+"; ngaysinh:"+ df.format(congnhan.getNgaysinh())
        + "; công ty:"+congnhan.getCongty());
              System.out.println(congnhan.calctax(2000));   
    }
}
