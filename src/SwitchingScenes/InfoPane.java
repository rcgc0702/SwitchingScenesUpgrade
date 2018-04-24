package SwitchingScenes;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class InfoPane extends GridPane {

    public InfoPane(PersonInfo p) {


        Label aLabel = new Label("First name: " + p.getFirstname() + " " + p.getLastname());
        Label blabel = new Label("-EMPTY-");

        add(aLabel,0,0);
        add(blabel,0,1);

    }
}
