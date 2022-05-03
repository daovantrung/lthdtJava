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
public class ProductCompByName implements Comparator<product> {

    @Override
    public int compare(product o1, product o2) {
            
        return o1.getName().compareToIgnoreCase(o2.getName()); 

    }
    
}
