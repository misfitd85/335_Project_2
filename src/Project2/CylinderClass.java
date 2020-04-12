package Project2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.stage.Stage;

public class CylinderClass extends Application {

    private static float height;
    private static float radius;



    @Override
    public void start(Stage stage) {
        //Drawing a Cylinder
        Cylinder cylinder = new Cylinder();

        //Setting the properties of the Cylinder
        cylinder.setHeight(height);
        cylinder.setRadius(radius);


        cylinder.setTranslateX(200);
        cylinder.setTranslateY(150);



        //Creating a Group object
        Group root = new Group(cylinder);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        stage.setTitle("This is your Cylinder!");

        //Adding scene to the stage
        stage.setScene(scene);

        scene.setFill(Color.BLUE);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void launchCylinder(){
        launch();
    }

    public static void setHeight(float h){
        height = h;
    }
    public static void setRadius(float r){
        radius = r;
    }


}