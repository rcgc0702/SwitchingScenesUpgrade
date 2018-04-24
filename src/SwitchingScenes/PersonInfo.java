package SwitchingScenes;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonInfo {

    private StringProperty firstname;
    private StringProperty lastname;
    private StringProperty city;
    private StringProperty residence;

    public PersonInfo(String firstname, String lastname, String city, String residence) {
        this.firstname = new SimpleStringProperty(firstname);
        this.lastname = new SimpleStringProperty(lastname);
        this.city = new SimpleStringProperty(city);
        this.residence = new SimpleStringProperty(residence);
    }

    public String getFirstname() {
        return firstname.get();
    }

    public StringProperty firstnameProperty() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname.set(firstname);
    }

    public String getLastname() {
        return lastname.get();
    }

    public StringProperty lastnameProperty() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname.set(lastname);
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getResidence() {
        return residence.get();
    }

    public StringProperty residenceProperty() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence.set(residence);
    }

    @Override
    public String toString() {
        return getLastname() + ", " + getFirstname();
    }
}
