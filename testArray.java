/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class testArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int[] a;
        //khoi tạo
//        a =new int[4];
//        a[0]=12;
//        a[1]=9;
//        a[2]=1;
//        a[3]=15;
        //xuất dữ liệu
//        System.out.println(a.toString());
            
//            System.out.println(Arrays.toString(a));
        
//            int[]b= new int[]{1,3,-7,8,9,20};
//           System.out.println(Arrays.toString(b));
//           System.out.println("Số luọng phân tử của mảng là"+b.length);
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Số luọng phân tử của mảng là");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        int[]c = new int[n];
         Random rnd = new Random();
        for(int i = 0; i<n;i++){
            c[i] = rnd.nextInt(1000);
              }
      System.out.println(Arrays.toString(c));
//        for(int i = 0; i<n;i++){
//            System.out.println("c[" +i+"] = ");
//            input = sc.nextLine();
//            c[i] = Integer.parseInt(input);
//            
//        }
//         System.out.println("Giá trị của mảng vừa nhập là");
//       //  System.out.println(Arrays.toString(c));
//    
//       for(int i = 0; i<c.length;i++){
//           System.out.println(c[i]+"");
//       }

//       int temp;
//       for(int i = 0; i<n;i++)
//           for(int j =i +1;j<n;j++){
//               if(c[i]>c[j]){
//                   temp = c[i];
//                   c[i] = c[j];
//                   c[j] = temp;
//               }
//           }
              
//            System.out.println(Arrays.toString(c));
            
      Arrays.sort(c);
         System.out.println("Mảng sau khi sắp xếp tăng dần:");
          System.out.println(Arrays.toString(c));
                    //Tìm kiem vet can
        System.out.println("Nhap gia trị cân tìm kiếm X = ");
        input = sc.nextLine();
         int x = Integer.parseInt(input);
         
         //tìm kiếm 
         int index = Arrays.binarySearch(c, x);
         if(index<0){
             System.out.println("Không tìm thấy");
         }else{
                 System.out.println("tìm thấy tại ví trí thứ"+index);
                 }
//       
//        
//        boolean flag = false;
//        for (int i = 0;i<c.length;i++){
//            if(c[i]== x){
//                System.out.println("Giá trị cần tìm kiếm có trog mảng tại vị trí"+i);
//                flag = true;
//                break;
//                
//            }
//        }
//        if(!flag){
//            System.out.println("Giá trị cần tìm kiếm không có trong mảng");
//        }
    }
    
}
