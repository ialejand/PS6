package domain;


import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import util.LocalDateAdapter;

public class PersonDomainModel {

    private  StringProperty FirstName;
    private  StringProperty LastName;
    private  StringProperty Street;
    private  IntegerProperty PostalCode;
    private  StringProperty City;
    private  UUID PersonID;
    private  ObjectProperty<LocalDate> Birthday;

	public PersonDomainModel(String string, String string2, String string3, int i, String string4, UUID perID, Date birthday2) {
	}
	
    /**
     * @param firstName
     * @param lastName
     * @param street
     * @param PostalCode
     * @param city
     * @param personID
     * @param birthday
     */
	

	
    public String getFirstName() {
        return FirstName.get();
    }

    public void setFirstName(String firstName) {
        this.FirstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return FirstName;
    }

    public String getLastName() {
        return LastName.get();
    }

    public void setLastName(String lastName) {
        this.LastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return LastName;
    }

    public String getStreet() {
        return Street.get();
    }

    public void setStreet(String street) {
        this.Street.set(street);
    }

    public StringProperty streetProperty() {
        return Street;
    }

    public int getPostalCode() {
        return PostalCode.get();
    }

    public void setPostalCode(int postalCode) {
        this.PostalCode.set(postalCode);
    }

    public IntegerProperty postalCodeProperty() {
        return PostalCode;
    }

    public String getCity() {
        return City.get();
    }

    public void setCity(String city) {
        this.City.set(city);
    }

    public StringProperty cityProperty() {
        return City;
    }
    
	public PersonDomainModel(UUID personID) {
		super();
		PersonID = personID;		
	}

	public UUID getPersonID() {
		return PersonID;
	}
	private void setPersonID(UUID personID) {
		PersonID = personID;
	}
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public LocalDate getBirthday() {
        return Birthday.get();
    }

    public void setBirthday(LocalDate birthday) {
        this.Birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty() {
        return Birthday;
    }
}