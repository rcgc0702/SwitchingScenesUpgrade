package SwitchingScenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;


public class Scene_One extends GridPane {


    public Scene_One() {

        setVgap(10);
        setHgap(10);
        setPadding(new Insets(10));

        ListView<PersonInfo> theListView = new ListView<>();

        theListView.setItems(PersonCol.getTheCollection());

        ContextMenu acontext = new ContextMenu();
        MenuItem amenuItem = new MenuItem("Open details");
        acontext.getItems().add(amenuItem);

        amenuItem.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                PersonInfo bw = theListView.getSelectionModel().getSelectedItem();
                if (bw == null) {
                    return;
                }

                ANewWindow b = new ANewWindow(new InfoPane(bw));
                b.setTitle(bw.getFirstname() + " " + bw.getLastname());
                b.show();
            }
        });

        theListView.setContextMenu(acontext);
        add(theListView,0,0);

    }
}
