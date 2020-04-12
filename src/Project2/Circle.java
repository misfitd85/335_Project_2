package Project2;

import javax.swing.*;
import java.awt.*;



public class Circle extends JPanel {

    private int radius;

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.fillOval(25,25, radius, radius);




    }

    public void setRadius(int r){
        r = (int) (Math.PI*Math.pow(r,2));
        radius = r;
    }

}
