package SwitchingScenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;


public class Scene_One extends GridPane {

    public Scene_One() {

        setVgap(10);
        setHgap(10);

        Button aButton = new Button("Switch to Two");
        Button bButton = new Button("Click me 2");

        add(aButton,0,0);
        add(bButton,0,1);

        aButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scene_Library.switchToTwo();
            }
        });

    }
}
