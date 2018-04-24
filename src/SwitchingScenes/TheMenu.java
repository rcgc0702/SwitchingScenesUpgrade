package SwitchingScenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class TheMenu extends MenuBar {

    public TheMenu() {

        /*
        Contents:
        1. MenuBar/MenuItem
        2. Button to switch scenes
         */

        Menu manage_task = new Menu("Manage Task");
        MenuItem all_records = new MenuItem("All Records");
        MenuItem enter_records = new MenuItem("Enter Records");

        getMenus().add(manage_task);
        manage_task.getItems().addAll(enter_records,all_records);

        enter_records.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scene_Library.switchTo(TheScenes.TWO);
            }
        });

        all_records.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Scene_Library.switchTo(TheScenes.ONE);
            }
        });

    }
}
