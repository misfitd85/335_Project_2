package Project2;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.AnnotationTypeMismatchException;


public class Gui extends JFrame {

    private JLabel label1;
    private JLabel instruct1;
    private JLabel num1Lab;
    private JTextField num1;
    private JLabel num2Lab;
    private JTextField num2;
    private JLabel depthLab;
    private JTextField depth;
    private JButton drawShape;
    private JButton triangle, circle, square, rectangle, sphere,  cylinder, cube;

    //GUI constructor
    Gui() {
        super("Draw-A-Shape");
        this.setSize(850, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(5, 5));
        this.setBackground(Color.GREEN);

        JPanel topPanel = new JPanel();
        topPanel.setBorder(new LineBorder(Color.BLACK, 3));
        topPanel.setBackground(Color.ORANGE);
        topPanel.setLayout(new FlowLayout());
        add(topPanel, BorderLayout.BEFORE_FIRST_LINE);


        label1 = new JLabel("Which shape would you like to create?");
        topPanel.add(label1, BorderLayout.CENTER);

        JPanel midPanel = new JPanel();
        midPanel.setBorder(new LineBorder(Color.BLACK, 5));
        midPanel.setBackground(Color.YELLOW);
        midPanel.setLayout(new FlowLayout());
        add(midPanel);



        //Buttons for Triangle, Circle, Square, Rectangle, Sphere, Cone, Cylinder, Cube and add to top panel
        triangle = new JButton("Triangle");
        triangle.addActionListener(new TriangleListener());

        circle = new JButton("Circle");
        circle.addActionListener(new CircleListener());

        square = new JButton("Square");
        square.addActionListener(new SquareListener());

        rectangle = new JButton("Rectangle");
        rectangle.addActionListener(new RectangleListener());

        sphere = new JButton("Sphere");
        sphere.addActionListener(new SphereListener());

        //cone = new JButton("Cone");

        cylinder = new JButton("Cylinder");
        cylinder.addActionListener(new CylinderListener());

        cube = new JButton("Cube");
        cube.addActionListener(new CubeListener());

        topPanel.add(triangle);
        topPanel.add(circle);
        topPanel.add(square);
        topPanel.add(rectangle);
        topPanel.add(sphere);
        //topPanel.add(cone);
        topPanel.add(cylinder);
        topPanel.add(cube);


        instruct1 = new JLabel("Please enter the desired dimensions for your shape (depth only applies to 3d objects!)");
        instruct1.setBackground(Color.CYAN);
        midPanel.add(instruct1);

        num1Lab = new JLabel("Base:");
        midPanel.add(num1Lab);
        num1 = new JTextField(3);
        midPanel.add(num1);

        num2Lab = new JLabel("Height:");
        midPanel.add(num2Lab);
        num2 = new JTextField(3);
        midPanel.add(num2);

        depthLab = new JLabel("Depth:");
        midPanel.add(depthLab);
        depth = new JTextField(3);
        midPanel.add(depth);

        drawShape = new JButton("Draw Your Shape!");
        midPanel.add(drawShape);


    }//end GUI constructor


        //Inner Classes for Button Listeners
    private class CircleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        num1Lab.setText("Radius:");
        num2Lab.setText("");
        depthLab.setText("");


        drawShape.removeActionListener(this);
        drawShape.addActionListener(this);
        if(e.getSource() == drawShape){




            Circle circ = new Circle();

            //takes user input and places it into rectangle dimensions
            circ.setRadius(Integer.parseInt(num1.getText()));



            //creates Circle object and places in a Frame
            JFrame f = new JFrame("This is your Circle!");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(circ);
            f.setSize(400,400);
            f.setVisible(true);
            //reset drawshape button??
            //drawShape.addActionListener(null);
       }
        }
    }//end CircleListener


    private class TriangleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1Lab.setText("Base:");
            num2Lab.setText("Height:");
            depthLab.setText("");

            drawShape.removeActionListener(this);
            drawShape.addActionListener(this);
            if(e.getSource()==drawShape){
                Triangle tri = new Triangle();


                //takes user input and places it into triangle dimension
                tri.setBase(Integer.parseInt(num1.getText())*100);
                tri.setHeight(Integer.parseInt(num2.getText())*100);

                //creates Triangle object and places in a Frame

                JFrame f = new JFrame("This is your triangle!");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.add(tri);
                f.setSize(800,800);
                f.setVisible(true);
                //reset drawshape button??
                //drawShape.addActionListener(null);
         }
        }
    }//end TriangleListener

    private class SquareListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1Lab.setText("Side:");
            num2Lab.setText("");
            depthLab.setText("");

            drawShape.removeActionListener(this);
            drawShape.addActionListener(this);
            if(e.getSource()==drawShape){
                Square sq = new Square();

                //takes user input and places it into rectangle dimensions
                sq.setArea(Integer.parseInt(num1.getText())* 10);



                //creates Circle object and places in a Frame
                JFrame f = new JFrame("This is your Square!");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.add(sq);
                f.setSize(400,400);
                f.setVisible(true);

            }
        }
    }//end SquareListener

    private class RectangleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1Lab.setText("Base:");
            num2Lab.setText("Height:");
            depthLab.setText("");


            drawShape.removeActionListener(this);
            drawShape.addActionListener(this);
            if(e.getSource()==drawShape){


                Rectangle rect = new Rectangle();

                //takes user input and places it into rectangle dimensions
                rect.setBase(Integer.parseInt(num1.getText()) * 10);
                rect.setHeight(Integer.parseInt(num2.getText()) * 10);


                //creates Rectangle object and places in a Frame
                JFrame f = new JFrame("This is your Rectangle!");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.add(rect);
                f.setSize(400,400);
                f.setVisible(true);
                           }

        }
    }//end RectangleListener


    private class SphereListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1Lab.setText("Radius:");
            num2Lab.setText("");
            depthLab.setText("");

            drawShape.removeActionListener(this);
            drawShape.addActionListener(this);
            if(e.getSource()==drawShape){
               // SphereClass sphere = new SphereClass();

                //takes user input and places it into sphere radius
                SphereClass.setRadius(Integer.parseInt(num1.getText())*10);
                SphereClass.launchSphere();

            }

        }
    }//end SphereListener

    private class CylinderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1Lab.setText("Height:");
            num2Lab.setText("Radius:");
            depthLab.setText("");

            drawShape.removeActionListener(this);
            drawShape.addActionListener(this);
            //if(e.getSource()==drawShape && cylinder.isSelected()){

                if(e.getSource()==drawShape){
                //take user input and places it into Cylinder parameters
                CylinderClass.setHeight(Integer.parseInt(num1.getText())*10);
                CylinderClass.setRadius(Integer.parseInt(num2.getText())*10);
                CylinderClass.launchCylinder();
                //cylinder.removeActionListener(this);
                    //drawShape.setEnabled(false);
                    //drawShape.removeActionListener(this);
            }

        }
           /* else{
            drawShape.removeActionListener(this);}

        }*/


    }//end CylinderListener

    private class CubeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num1Lab.setText("Width:");
            num2Lab.setText("Height:");
            depthLab.setText("Depth:");

            drawShape.removeActionListener(this);
            drawShape.addActionListener(this);

            if(e.getSource()==drawShape){
                //take user input and place it into Cube parameters
                CubeClass.setWidth(Double.parseDouble(num1.getText())*10);
                CubeClass.setHeight(Double.parseDouble(num2.getText())*10);
                CubeClass.setDepth(Double.parseDouble(depth.getText())*10);
                CubeClass.launchCube();

            }
        }
    }//end CubeListener
}
