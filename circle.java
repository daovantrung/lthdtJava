/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.donglenh.chuong1;

/**
 *
 * @author macbookair
 */
public class circle extends Shape  {

    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    private int radius;
    private int x,y;
    
    public circle(){
        
    }
    
    public circle(int radius,int x,int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    @Override
    public double calcPerimeter(){
        double result = 2*Math.PI*this.getRadius();
        return result;
    }
    
    @Override
    public double calcArea(){
        double result = Math.PI*this.getRadius()*this.getRadius();
        return result;
        
    }
     @Override
    public String toString(){
        
        String output = "chu vi hinh tron la: "+calcPerimeter()+
                "; dien tich là: "+calcArea();
        return output;   
    }
    
}

