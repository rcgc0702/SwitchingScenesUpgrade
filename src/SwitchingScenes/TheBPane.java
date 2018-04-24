package SwitchingScenes;

import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

public class TheBPane extends BorderPane {

    private static MenuBar theMenu = new TheMenu();

    public TheBPane() {
        setTop(theMenu);

    }
}
