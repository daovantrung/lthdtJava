/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt.chuong2.shapelogic;

import java.awt.Graphics2D;

/**
 *
 * @author macbookair
 */
public class Drawline {

    private Graphics2D gr;
    private Line line ;

    public Drawline() {
    }

    public Drawline(Graphics2D gr, Line line) {
        this.gr = gr;
        this.line = line;
    }

    public Graphics2D getGr() {
        return gr;
    }

    public void setGr(Graphics2D gr) {
        this.gr = gr;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }





   public void veduongthang(){
      gr.drawLine(line.getBegin_x(),
              line.getBegin_y(),
              line.getEnd_x(),
              line.getEnd_y());
   }

}
