/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong4.logic;

/**
 *
 * @author macbookair
 */
public class FibonacciNumber {

    public FibonacciNumber() {
    }
    public int calcFibo(int n){
        //dieu kien dung
        if(n == 1)
            return 0;
        if(n==2)
            return 1;
        //loi goi de quy
        return (calcFibo(n-1)+calcFibo(n-2));
    }
}
