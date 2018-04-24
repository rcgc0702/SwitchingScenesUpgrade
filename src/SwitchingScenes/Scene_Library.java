package SwitchingScenes;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public abstract class Scene_Library {

    private static BorderPane pane;
    private static Stage pStage;
    private static GridPane sceneone = new Scene_One();
    private static GridPane scenetwo = new Scene_Two();

    public static void switchTo(TheScenes enm) {

        GridPane xwz = null;
        switch (enm) {
            case ONE:
                xwz = sceneone;
                break;
            case TWO:
                xwz = scenetwo;
                break;
        }
        pane.setCenter(xwz);
        pane.prefHeight(300);
    }

    public static void setThePane(BorderPane root) {
        pane = root;
    }

    public static void setTheStage(Stage primaryStage) {
        pStage = primaryStage;
    }

    public static void changeTitle(String text) {
        pStage.setTitle(text);
    }
}
