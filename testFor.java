/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.donglenh;

import java.util.Random;

/**
 *
 * @author macbookair
 */
public class testFor {
    public static void main(String[]args){
        //tính tổng thư nhất
        int n = 100;
        double s=0;
        for(int i=1;i<=n;i++){
            s = s+(double)1/i;
        }
        System.out.println("tổng thứ nhất là "+ s);
        
        
        //tổng thứ 2;
        n = 99;
        int s2 = 0;
        for(int i = 1; i<=n;i += 2 ){
            s2 = s2 + i;
            
        }
                System.out.println("tổng thứ nhất là "+ s2);
 Random rnd = new Random();
 int x;
        //sinh ngẫu nhiên n số nguyên;
        for(int i = 0; i <10; i++){
        
        x = rnd.nextInt(101);
        System.out.println(x);
    }
       
    
    }
}
