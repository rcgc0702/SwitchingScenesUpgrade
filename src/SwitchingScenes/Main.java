package SwitchingScenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // I AM ENDING THIS PRACTICE HERE. IT'S 12:17 AM. I'M TIRED!
        // USED CONTEXTMENU
        // COLLECTED SCENES IN 1 CLASS FOR EASY ACCESS
        // NO I/O DONE FOR THIS (MAYBE NEXT TIME)
        // RIZCAN - APRIL 24, 2018

        BorderPane root = new TheBPane();
        primaryStage.setTitle("Switching Scenes");
        primaryStage.setScene(new Scene(root, 325, 275));
        Scene_Library.setThePane(root);
        Scene_Library.setTheStage(primaryStage);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
