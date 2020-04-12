package Project2;


import java.applet.Applet;
import java.awt.*;

public class Triangle extends Applet {

private int base;
private int height;

    public void paint(Graphics g){

        //int[] xPoints = {50,10,90};
        //coords = 50,10  10,30,  90,30
        //int[] yPoints = {10,30,30};
        int[] xPoints = {50, base, 800};
        int[] yPoints = {500, height, 500};

        g.setColor(Color.BLACK);
        g.fillPolygon(xPoints, yPoints, 3);


        //Polygon() triangle = new Polygon();
        //triangle.addPoints();
    }


    public void setBase(int b){
        base = b;
    }

    public void setHeight(int h){
        height = h;
    }

}