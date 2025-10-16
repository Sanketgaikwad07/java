//
//
//    import javafx.application.Application;
//import javafx.scene.*;
//import javafx.scene.paint.Color;
//import javafx.scene.paint.PhongMaterial;
//import javafx.scene.shape.Box;
//import javafx.stage.Stage;
//
//    public class MultiDimentio extends Application {
//
//        @Override
//        public void start(Stage primaryStage) {
//            // Create a 3D box
//            Box box = new Box(100, 100, 100);
//
//            // Add material (color)
//            PhongMaterial material = new PhongMaterial();
//            material.setDiffuseColor(Color.CORNFLOWERBLUE);
//            box.setMaterial(material);
//
//            // Create a group and scene
//            Group root = new Group();
//            root.getChildren().add(box);
//
//            // Add camera
//            PerspectiveCamera camera = new PerspectiveCamera(true);
//            camera.setTranslateZ(-500); // Move camera back
//
//            // Setup scene
//            Scene scene = new Scene(root, 600, 400, true);
//            scene.setFill(Color.LIGHTGRAY);
//            scene.setCamera(camera);
//
//            // Show
//            primaryStage.setTitle("Simple JavaFX 3D Box");
//            primaryStage.setScene(scene);
//            primaryStage.show();
//        }
//
//        public static void main(String[] args) {
//            launch(args);
//        }
//    }
//
//
