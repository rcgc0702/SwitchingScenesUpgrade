package SwitchingScenes;

import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class Scene_Library {

    private static Stage thePrimaryStage;
    private static Scene sceneOne = new Scene(new Scene_One(),300,500);
    private static Scene sceneTwo = new Scene(new Scene_Two(),200,200);

    public static void setThePrimaryStage(Stage thePrimaryStage) {
        Scene_Library.thePrimaryStage = thePrimaryStage;
    }

    public static void switchToOne() {
        thePrimaryStage.setScene(sceneOne);
    }

    public static void switchToTwo() {
        thePrimaryStage.setScene(sceneTwo);
    }
}
