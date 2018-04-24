package SwitchingScenes;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class Scene_Two extends GridPane {

    private static ObservableList<String> province = FXCollections.observableArrayList();
    private static String selectedProvince;

    public Scene_Two() {

        /*
        Contents:
        1. Textfields (for input)
        2. Button (sumbit entry)
         */

        setHgap(10);
        setVgap(10);
        setPadding(new Insets(10));

        province.addAll("Alberta","Manitoba", "Saskatchewan","Ontario",
                "Quebec","British Columnbia","Yukon","Newfoundland and Labrador",
                "Prince Edward Island");

        Label aLabel = new Label("First Name:");
        Label bLabel = new Label("Last Name:");
        Label cLabel = new Label("City of Residence");
        Label dLabel = new Label("Province");
        TextField aTextField = new TextField();
        aTextField.setPromptText("First name");
        TextField bTextField = new TextField();
        bTextField.setPromptText("Last name");
        TextField cTextField = new TextField();
        cTextField.setPromptText("City of Residence");
        ComboBox theCB = new ComboBox();
        theCB.getItems().addAll(province);


        Button aButton = new Button("Submit");
        aButton.prefWidth(150);

        add(aLabel,0,0);
        add(bLabel,0,1);
        add(cLabel,0,2);
        add(dLabel,0,3);
        add(aTextField,1,0);
        add(bTextField,1,1);
        add(cTextField,1,2);
        add(theCB,1,3);
        add(aButton,0,4,2,1);


        aTextField.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                Scene_Library.changeTitle(createName(aTextField,bTextField));
            }
        });

        bTextField.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                Scene_Library.changeTitle(createName(aTextField,bTextField));
            }
        });

        theCB.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                selectedProvince = newValue.toString();
            }
        });

        aButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                PersonInfo aPersonInfo = new PersonInfo(aTextField.getText(),
                        bTextField.getText(),cTextField.getText(),
                        selectedProvince);

                clearField(Scene_Two.this); /// I like this syntax
                PersonCol.addToList(aPersonInfo);
            }
        });
    }

    public static void clearField(GridPane g) {
        for (Node n: g.getChildren()) {
            if (n instanceof TextField) {
                ((TextField) n).clear();
            }
        }
    }

    private static String createName(TextField a, TextField b) {
        return a.getText() +" "+ b.getText();
    }
}
