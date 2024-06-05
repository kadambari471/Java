package labpack;

public class Person {
	String firstName;
	String lastName;
	public Person(String firstName, String lastName) { //Constructor
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() { //getter
		return firstName;
	}
	public String getLastName() { //getter
		return lastName;
	}
}
