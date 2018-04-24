package SwitchingScenes;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class ANewWindow extends Stage {

    public ANewWindow(GridPane pane) {

        setScene(new Scene(pane,300,500));

    }
}
