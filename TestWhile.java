/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class TestWhile {
    public static void main(String[]args){
        int n = 0;
        int i;
        //kỹ thuật cộng dồn;
//        double s1=0;
//        n = 100;
//        i = 1;
//        while(i<=n){
//            s1 = s1+(double)1/i;
//            i = i+1;
//            
//        }
//        System.out.println("tổng thứ nhất là: s1 = "+s1);

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            System.out.println("Nhap số nguyên dương le n =");
            String intput = sc.nextLine();
            n = Integer.parseInt(intput);
//            if ((n>0)&&(n%2 !=0)){
//            flag = true;
//        }else{
//               flag = false; 
//            }
            flag = ((n>0)&&(n%2 !=0))?true:false;
        }
        
        //kỹ thuật bước nhảy;
        int s2=0;
        i=1;
        
        while(i <= n){
            s2 = s2+i;
            i = i+2;
            
        }
        System.out.println("tổng thứ hai là s2 ="+s2);
    }
}
