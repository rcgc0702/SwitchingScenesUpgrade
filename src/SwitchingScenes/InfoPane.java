package SwitchingScenes;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class InfoPane extends GridPane {

    public InfoPane(PersonInfo p) {

        setPadding(new Insets(8));

        Label aLabel = new Label("First name: " + p.getFirstname() + " " + p.getLastname());
        aLabel.setStyle("-fx-font-size: 20;-fx-text-fill: cadetblue");

        Label blabel = new Label(p.getCity() + ", " + p.getResidence());
        blabel.setStyle("-fx-font-size: 20;-fx-text-fill: cadetblue");

        add(aLabel,0,0);
        add(blabel,0,1);

    }
}
