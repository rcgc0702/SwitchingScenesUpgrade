package SwitchingScenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;


public class Scene_Two extends GridPane {

    public Scene_Two() {

        setHgap(10);
        setVgap(10);

        Button aButton = new Button("Switch to One");
        Button bButton = new Button("No, No, No");

        add(aButton,0,0);
        add(bButton,0,1);

        aButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scene_Library.switchToOne();
            }
        });

    }
}
