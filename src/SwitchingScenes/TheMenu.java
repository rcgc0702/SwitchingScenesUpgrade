package SwitchingScenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class TheMenu extends MenuBar {

    public TheMenu() {

        Menu a1 = new Menu("Change scene");
        MenuItem a12 = new MenuItem("All Records");
        MenuItem a11 = new MenuItem("Enter Records");

        getMenus().add(a1);
        a1.getItems().addAll(a11,a12);

        a11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scene_Library.switchTo(TheScenes.TWO);
            }
        });

        a12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scene_Library.switchTo(TheScenes.ONE);
            }
        });

    }
}
