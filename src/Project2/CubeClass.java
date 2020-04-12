package Project2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class CubeClass extends Application {

    private static double width;
    private static double height;
    private static double depth;


    @Override
    public void start(Stage stage) {
        //Drawing a Box
        Box cube = new Box();

        //Setting the properties of the Box
        cube.setWidth(width);
        cube.setHeight(height);
        cube.setDepth(depth);

        cube.setTranslateX(200);
        cube.setTranslateY(150);

        //Creating a Group object
        Group root = new Group(cube);


        PerspectiveCamera camera = new PerspectiveCamera();









        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);
        scene.setCamera(camera);

        scene.setFill(Color.BLUE);

        //Setting title to the Stage
        stage.setTitle("Your Cube!");

        //Adding scene to the stage
        stage.setScene(scene);

        //adds rotation to the cube
        Rotate xRotation = new Rotate(25, Rotate.X_AXIS);
        Rotate yRotation = new Rotate(25,Rotate.Y_AXIS);
        cube.getTransforms().addAll(xRotation,yRotation);

        //Displaying the contents of the stage
        stage.show();

    }

    public static void setWidth(double w){
        width = w;
    }
    public static void setHeight(double h){
        height = h;
    }
    public static void setDepth(double d){
        depth = d;
    }


    public static void launchCube(){
        launch();
    }
}