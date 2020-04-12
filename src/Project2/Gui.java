package Project2;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui extends JFrame implements ActionListener {

    private JLabel label1;
    private String[] shapes = {"Triangle","Circle","Square","Rectangle","Sphere","Cone","Cylinder","Cube"};
    private JComboBox<String> selection1;
    private JLabel instruct1;
    private JLabel num1Lab;
    private JTextField num1;
    private JLabel num2Lab;
    private JTextField num2;
    private JLabel depthLab;
    private JTextField depth;
    private JButton drawShape;

    //GUI constructor
    Gui(){
        super("Draw-A-Shape");
        this.setSize(700,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(5,5));
       this.setBackground(Color.GREEN);

       JPanel topPanel = new JPanel();
       topPanel.setBorder(new LineBorder(Color.BLACK,3));
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
        selection1 = new JComboBox(shapes);
       // selection1.setPreferredSize(new Dimension(130,130));
       midPanel.add(selection1, BorderLayout.CENTER);


        instruct1 = new JLabel("Please enter the desired dimensions for your shape (enter depth only for 3d objects)");
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
        drawShape.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        //if drawShape button is pressed
        if(e.getSource() == drawShape){

            //if the user selected a Rectangle
            if(selection1.getSelectedItem().equals("Rectangle")){
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
            }//end Rectangle selection

            //if Triangle is selected
            if(selection1.getSelectedItem().equals("Triangle")){
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



            }//end Triangle selection


            //if Circle is selected
            if(selection1.getSelectedItem().equals("Circle")){
                Circle circ = new Circle();

                //takes user input and places it into rectangle dimensions
                circ.setRadius(Integer.parseInt(num1.getText()));



                //creates Circle object and places in a Frame
                JFrame f = new JFrame("This is your Circle!");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.add(circ);
                f.setSize(400,400);
                f.setVisible(true);

            }//end Circle selection


            //if Project2.Square is selected
            if(selection1.getSelectedItem().equals("Square")){
                Square sq = new Square();

                //takes user input and places it into rectangle dimensions
                sq.setArea(Integer.parseInt(num1.getText())* 10);



                //creates Circle object and places in a Frame
                JFrame f = new JFrame("This is your Square!");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.add(sq);
                f.setSize(400,400);
                f.setVisible(true);

            }//end Project2.Square selection

        }



    }


  /*  public class EventHandler implements ActionListener {




        @Override
        public void actionPerformed(ActionEvent e) {
            drawShape.addActionListener(this);

            if(e.getSource() == drawShape){
                if(selection1.getSelectedItem().equals("Rectangle")){
                    rect.setVisible(true);
                }
            }

        }



    }*/




}
