package Project2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Sphere;

public class SphereClass extends Application {

    private static double radius;


    @Override
    public void start(Stage stage) {
        //Drawing a Sphere
        Sphere sphere = new Sphere();

        //Setting the properties of the Sphere
        sphere.setRadius(radius);

        sphere.setTranslateX(200);
        sphere.setTranslateY(150);

        //Creating a Group object
        Group root = new Group(sphere);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        scene.setFill(Color.BLUE);

        //Setting title to the Stage
        stage.setTitle("This is your sphere!");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void launchSphere(){
        launch();
    }

    public static void setRadius(double r){
        radius = r;
    }



}