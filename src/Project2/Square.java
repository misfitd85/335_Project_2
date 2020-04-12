package Project2;

import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    private int width;
    private int height;

    public void paintComponent(Graphics g){



        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, width, height);

     }

     public void setArea(int s){
        height = s;
        width = s;
     }



}
