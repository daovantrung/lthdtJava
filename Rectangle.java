/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author macbookair
 */
public class Rectangle extends Shape {

    /**
     * @return the upper_x
     */
    public int getUpper_x() {
        return upper_x;
    }

    /**
     * @param upper_x the upper_x to set
     */
    public void setUpper_x(int upper_x) {
        this.upper_x = upper_x;
    }

    /**
     * @return the upper_y
     */
    public int getUpper_y() {
        return upper_y;
    }

    /**
     * @param upper_y the upper_y to set
     */
    public void setUpper_y(int upper_y) {
        this.upper_y = upper_y;
    }

    /**
     * @return the lower_x
     */
    public int getLower_x() {
        return lower_x;
    }

    /**
     * @param lower_x the lower_x to set
     */
    public void setLower_x(int lower_x) {
        this.lower_x = lower_x;
    }

    /**
     * @return the lower_y
     */
    public int getLower_y() {
        return lower_y;
    }

    /**
     * @param lower_y the lower_y to set
     */
    public void setLower_y(int lower_y) {
        this.lower_y = lower_y;
    }
    private int upper_x, upper_y,  lower_x, lower_y;
    

public Rectangle(){

}
public Rectangle(int upper_x,int upper_y, int lower_x,int lower_y){
    this.upper_x = upper_x;
    this.upper_y =upper_y;
    this.lower_x =lower_x;
    this.lower_y =lower_y;
}
    @Override
    public double calcPerimeter(){
    return(2*Math.abs(getUpper_x() - getLower_x())+(Math.abs(getUpper_y() - getLower_y())));
}
    @Override
    public double calcArea(){
    return Math.abs((getUpper_x() - getLower_x())*(getUpper_y() - getLower_y()));
}
    @Override
    public String toString(){
        
        String output = "chu vi hinh chu nhat la: "+calcPerimeter()+
                "; dien tich là: "+calcArea();
        return output;
    }




}
