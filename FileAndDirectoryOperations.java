/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong5.logic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbookair
 */
public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    //thao tác liệt kê tất cả các thư mục và tập tin trong thư mục hiện tại
    public File[] getDirectoryContent(String folder){
        File directory = new File(folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
        
    }
    //thao tac xuất kết quả
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<content.length;i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
        sb.append("\n");
        }
            return sb.toString();
    }
    //lọc ra các thư mục
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i =0; i<content.length;i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    
    //thao tac loc ra tất cả tập tin
    
    public File[]getFiles(File[]content){
        ArrayList<File> result = new ArrayList<>();
        for(int i =0; i<content.length;i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    // thao tac duyệt đệ quy xuất tất cả tập tin và thu muc
    public void getcontentRecursively(String folder){
        
        File content = new File(folder);
        
        //điều kiện dùng
        if(content.isFile()){
        System.out.println(content.getPath()+ File.separator +content.getName());
        return;
        }
        //câugoij đệ quy trong stack
        System.out.println("Thư mục:"+folder);
        File[] sub = content.listFiles();
        for(int i=0;i<sub.length;i++){
            getcontentRecursively(folder +File.separator +sub[i].getName());
        }

    }
    
    //Đọc File Văn Bản
    public String readTextFile(String filename){
        StringBuilder content = new StringBuilder();
        
        try {
            //mở file
            FileReader fr = new FileReader(filename);
            //dùng bộ đệm
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine()) != null){
            content.append(line);
            content.append("\n");
        }
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
          //  Logger.getLogger(FileAndDirectoryOperations.class.getName()).log(Level.SEVERE, null, ex);
        return "KHông tìm thấy file"+filename;
        } catch (IOException ex) {
          //  Logger.getLogger(FileAndDirectoryOperations.class.getName()).log(Level.SEVERE, null, ex);
        return "kHông thể đọc file"+filename;
        }
        return content.toString();
    }

  //Thao tác lưu tâp tin văn bản
    public boolean writeTextFile(String filename,String content){
        boolean flag = true;
        try {
            //
            FileWriter fw = new FileWriter(filename);
            //sử dụng bufer
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(content);
            //đóng file
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
           // Logger.getLogger(FileAndDirectoryOperations.class.getName()).log(Level.SEVERE, null, ex);
        return false;
        }
        return flag;
       
    }
    
}
