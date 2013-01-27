package adressbook.model;

import javafx.beans.property.SimpleStringProperty;

public class Contact {
	private final SimpleStringProperty firstName = new SimpleStringProperty("");
	private final SimpleStringProperty lastName = new SimpleStringProperty("");
	private final SimpleStringProperty age = new SimpleStringProperty("");
	private final SimpleStringProperty birthday = new SimpleStringProperty("");
	private final SimpleStringProperty email = new SimpleStringProperty("");

	public Contact(String name, String firstname, String birthday, String email, String age) {
	}

	public void setFirstName(String name){
		firstName.set(name);
	}
	
	public SimpleStringProperty getFirstName() {
		return firstName;
	}

	public SimpleStringProperty getLastName() {
		return lastName;
	}

	public SimpleStringProperty getAge() {
		return age;
	}

	public SimpleStringProperty getBirthday() {
		return birthday;
	}

	public SimpleStringProperty getEmail() {
		return email;
	}

}
