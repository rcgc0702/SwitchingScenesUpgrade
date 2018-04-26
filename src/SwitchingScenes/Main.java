package SwitchingScenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        BorderPane root = new TheBPane();
        primaryStage.setTitle("Switching Scenes");
        primaryStage.setScene(new Scene(root, 350, 275));
        Scene_Library.setThePane(root);
        Scene_Library.setTheStage(primaryStage);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
