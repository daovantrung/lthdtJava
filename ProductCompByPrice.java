/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong3.coffeelogic;

import java.util.Comparator;

/**
 *
 * @author macbookair
 */
public class ProductCompByPrice implements Comparator<product>{

    @Override
    public int compare(product o1, product o2) {
            
        double temp = o1.getPrice() - o2.getPrice();
        return (int)temp;

    }
    
}
