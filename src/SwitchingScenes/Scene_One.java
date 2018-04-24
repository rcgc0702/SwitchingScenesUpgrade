package SwitchingScenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;


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

        ListView<PersonInfo> theListView = new ListView<>();
        theListView.setItems(PersonCol.getTheCollection());

        ContextMenu listContextMenu = new ContextMenu();
        MenuItem amenuItem = new MenuItem("Open details...");
        listContextMenu.getItems().add(amenuItem);

        amenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                PersonInfo bw = theListView.getSelectionModel().getSelectedItem();
                if (bw == null) {
                    return;
                }

                ANewWindow b = new ANewWindow(new InfoPane(bw));
                b.setTitle(bw.getFirstname() + " " + bw.getLastname());
                b.initModality(Modality.APPLICATION_MODAL);
                b.show();
            }
        });
        theListView.setContextMenu(listContextMenu);
        getColumnConstraints().add(new ColumnConstraints(300));

        add(theListView,0,0,4,1);


    }
}
