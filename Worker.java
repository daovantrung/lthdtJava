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
public class Worker extends Person implements taxinterface{

    /**
     * @return the congty
     */
    public String getCongty() {
        return congty;
    }

    /**
     * @param congty the congty to set
     */
    public void setCongty(String congty) {
        this.congty = congty;
    }
    private String congty;
    
    public Worker(){
        
    }
    public Worker(String congty,String hoten,int gioitinh, Date ngaysinh){
        super(hoten,gioitinh,ngaysinh);
        this.congty =congty;
    }

    @Override
    public double calctax(double income) {
        return (0.04*income);
    }
    
}
