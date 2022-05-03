/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong3.coffeelogic.CoffeeShop;
import lthdt.chuong3.coffeelogic.Manager;

/**
 *
 * @author macbookair
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df =new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
        CoffeeShop[]a = new CoffeeShop[]{new CoffeeShop("Kha coffee","Huế"),
                        new CoffeeShop("Sky","Đà nẵng"),
                        new CoffeeShop("Sun Coffee","Quảng TRị")};
        Manager[] manager = new Manager[]{
            new Manager(a, 1000,"Le Thi A",0,df.parse("12-12-2001")),
        new Manager(new CoffeeShop[]{
            new CoffeeShop("Hoang Hạc","12 nguỹen huệ")
        },
        2000, "Nguyễn Văn B",1,df.parse("12-12-1999"))
                };
        
        System.out.println(Arrays.toString(manager));
    }
    
}
