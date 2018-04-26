package SwitchingScenes;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;
import javafx.scene.input.ClipboardContent;
import javafx.stage.Modality;

import java.util.Comparator;

public abstract class RunEvents {

    /*
    Note:
    EventHandlers for the Listview ContextMenu
     */

    public static EventHandler<ActionEvent> copy(ListView<? extends PersonInfo> lv, ClipboardContent cc) {

        EventHandler<ActionEvent> copyToClipboard = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                PersonInfo gg = lv.getSelectionModel().getSelectedItem();
                gg.copyToClipBoard(cc);
            }
        };
        return copyToClipboard;
    }

    public static EventHandler<ActionEvent> open(ListView<? extends PersonInfo> lv) {

        EventHandler<ActionEvent> openDetails = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PersonInfo p_info = lv.getSelectionModel().getSelectedItem();
                if (p_info == null) {
                    return;
                }

                SecondStage person1 = new SecondStage(new InfoPane(p_info));
                person1.setTitle(p_info.toString());
                person1.initModality(Modality.APPLICATION_MODAL);
                person1.show();
            }
        };

        return openDetails;
    }

    public static EventHandler<ActionEvent> sort() {

        Comparator<PersonInfo> comparator = new Comparator<PersonInfo>() {
            @Override
            public int compare(PersonInfo o1, PersonInfo o2) {

                String name1 = o1.getLastname();
                String name2 = o2.getLastname();

                return name1.compareTo(name2);
            }
        };

        EventHandler<ActionEvent> sortList = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList<PersonInfo> pList = PersonCol.getTheCollection();
                pList.sort(comparator);

            }
        };
        return sortList;
    }
}
