package SwitchingScenes;

import javafx.geometry.Insets;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;


public class Scene_One extends GridPane {

    public Scene_One() {

        /*
        CONTENTS:
        1. ListView
        2. ContextMenu (to open new window)
         */

        setVgap(10);
        setHgap(10);
        setPadding(new Insets(10));
        ClipboardContent cb = new ClipboardContent();

        ListView<PersonInfo> theListView = new ListView<>();
        theListView.setItems(PersonCol.getTheCollection());

        ContextMenu listContextMenu = new ContextMenu();
        MenuItem openDetails = new MenuItem("Open details...");
        MenuItem copyToClipBoard = new MenuItem("Copy to clipboard");
        MenuItem sortList = new MenuItem("Sort list");
        SeparatorMenuItem separator = new SeparatorMenuItem();
        listContextMenu.getItems().addAll(sortList, separator, openDetails, copyToClipBoard);

        openDetails.setOnAction(RunEvents.open(theListView));
        copyToClipBoard.setOnAction(RunEvents.copy(theListView, cb));
        sortList.setOnAction(RunEvents.sort());

        theListView.setContextMenu(listContextMenu);
        getColumnConstraints().add(new ColumnConstraints(300));

        add(theListView,0,0,4,1);


    }
}
