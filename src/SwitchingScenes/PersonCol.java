package SwitchingScenes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public abstract class PersonCol {

    /*
    Note: The size of the Observable list has been limited to 10 on th addToList() method
     */

    private static ObservableList<PersonInfo> theCollection = FXCollections.observableArrayList();

    public static ObservableList<PersonInfo> getTheCollection() {
        return theCollection;
    }

    public static void addToList(PersonInfo p) {

        if (theCollection.size() == 10) {
            theCollection.remove(0);
        }

        theCollection.addAll(p);
    }
}
