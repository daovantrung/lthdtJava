/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.util.Date;

/**
 *
 * @author macbookair
 */
public class Student extends Person implements taxinterface {

    /**
     * @return the truonghoc
     */
    public String getTruonghoc() {
        return truonghoc;
    }

    /**
     * @param truonghoc the truonghoc to set
     */
    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }
    private String truonghoc;
    
    public Student(){
        
    }
    public Student(String truonghoc, String hoten, int gioitinh, Date ngaysinh){
        super(hoten, gioitinh,ngaysinh);
        this.truonghoc = truonghoc; 
    }
   
    @Override
    public double calctax(double income){
        double tax;
        tax = 0.01*income;
        return tax;
    }
}
