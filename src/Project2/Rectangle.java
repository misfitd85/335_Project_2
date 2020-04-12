package Project2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Rectangle extends JPanel {


    private int base;
    private int height;


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, base, height);


        }

        public void setBase(int b){
        base = b;
        }

        public void setHeight(int h){
        height = h;
        }



}
