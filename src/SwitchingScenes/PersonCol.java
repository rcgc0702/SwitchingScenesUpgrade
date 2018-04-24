package SwitchingScenes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public abstract class PersonCol {

    private static ObservableList<PersonInfo> theCollection = FXCollections.observableArrayList();

    public static ObservableList<PersonInfo> getTheCollection() {
        return theCollection;
    }

    public static void addToList(PersonInfo p) {
        theCollection.addAll(p);
    }
}
