package SwitchingScenes;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class SecondStage extends Stage {

    public SecondStage(GridPane pane) {

        setScene(new Scene(pane, 300, 200));

    }

}
