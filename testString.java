/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lthdt.chuong3.donglenh;

/**
 *
 * @author macbookair
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = "Long lanh day nuoc in troi \n Thanh xaykhoi biec non phoi bong nang";
        System.out.println(content);
        //thao tac tim vị tri cua 1 ký tự
        
        System.out.println("ví trị cyar ký tự a trong chuỗi là:"+content.indexOf('a'));
         System.out.println("ví trị cyar từ nước trong chuỗi là:"+content.indexOf("nuoc"));
//thao tac kiểm tra khỏi đầu và kết thucs
        System.out.println("chuỗi mở đầu long:"+content.startsWith("Long"));
                System.out.println("chuỗi kết  thúc troi:"+content.endsWith("Long"));
//thao tac căt chuỗi theo vị trí
        String temp = content.substring(22, 26);
        System.out.println("Chuỗi con là: "+temp);
// thao tac phân tách chuỗi
        String[] result = content.split("\n");
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }
           //thao tac loại bỏ khoảng trắng đauaf cuối chuỗi
           
            for(int i = 0;i<result.length;i++){
              System.out.println(result[i].trim());
             
        }
             //thao tac thay thế ký tự
             temp = content.replace("a","z");
             System.out.println(temp);
             
             //thao tác chuyển kiểuchữ hoa
             temp = content.toUpperCase();
             System.out.println(temp);
             temp = content.toLowerCase();
              System.out.println(temp);
              
              
              
              //So sánh chuỗi
              temp = "Nguyen";
              if(temp.compareToIgnoreCase("nguyen")==0){
                  System.out.println("2 chuỗi bằng nhau");
                  
              }else{
                                  System.out.println("2 chuỗi không bằng nhau");

                      }
              //thao tac nối chuỗi
             temp =  temp.concat("Van A");
              System.out.println(temp);
             //thao tác truy xuất bằng chi so
             for(int i = 0;i <temp.length();i++){
                 System.out.println(temp.charAt(i));
             }
             System.out.println();
             
             //thao tac chuyển kiểu
             temp = "155";
             int n = Integer.parseInt(temp);
             System.out.println("n = "+n);
             
             //thao tac sử dụng string builder
             StringBuilder sb = new StringBuilder();
             sb.append("Long lanh day nuoc in troi\n");
             sb.append("Thanh xay khoi biec non phoi bong vang");
             temp = sb.toString();
             System.out.println(sb);
    }
    
}
