/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import lthdt.chuong3.coffeelogic.ProductCompByName;
import lthdt.chuong3.coffeelogic.ProductCompByPrice;
import lthdt.chuong3.coffeelogic.product;

/**
 *
 * @author macbookair
 */
public class testproductarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tạo mảng các sản phẩm
        product[] sp = new product[]{new product("Sunsilk",12),
        new product("life boy",5),
        new product("Sunsilk",7),
        new product("Espréso",2),
         new product("thien long",1)};
        
        System.out.println("Mảng ban đầu là ");
        System.out.println(Arrays.toString(sp));
//        product temp;
//        for(int i = 0; i<sp.length;i++)
//            for(int j=i+1;j<sp.length;j++){
//                if(sp[i].getPrice()>sp[j].getPrice()){
//                    temp = sp[i];
//                    sp[i] = sp[j];
//                    sp[j] = temp;
//                    
//                }
//            }
// sắp xếp mảng thoe giá cả tăng dần

//        Arrays.sort(sp, new ProductCompByPrice());
//        System.out.println("Mảng sắp xếp tăng dần theo giá cả ");
//        System.out.println(Arrays.toString(sp));
         System.out.println("Mảng sắp xếp sản phẩm  theo tên");
         Arrays.sort(sp, new ProductCompByName());
          System.out.println(Arrays.toString(sp));
          
          int index = Arrays.binarySearch(sp, new product("Sunsilk",12),
                  new ProductCompByName());
          if(index<0){
              System.out.println("Không tìm thấy");
              
          }else{
              System.out.println("phần tử thứ"+index+"chứa giá trị cần tìm");
              System.out.println(sp[index]);
          }
    }
    
}
