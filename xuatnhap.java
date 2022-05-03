/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class xuatnhap {
    public static void main(String[] args){
        boolean flag = true;
        int a = 15;
        byte b = 2;
        double c = 12.6;
        float d = 4.5f;
        String s = "Hello word";
        char ch = 'A';
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy Nhập Họ Tên: ");
        String hoten = sc.nextLine();
        System.out.println("Bạn đã nhập họ tên là" +hoten);
        
        System.out.print("Hãy nhập vào 1 số nguyên: ");
        String input = sc.nextLine();
        a =  Integer.parseInt(input);
        System.out.println("Số nguyên mà bạn đã nhâpj là: " +a);
        
        System.out.print("Hãy nhập vào 1 số thực : ");
        input = sc.nextLine();
         c =  Double.parseDouble(input);
        System.out.println("Số nguyên mà bạn đã nhập là: " +c );
    }
}
