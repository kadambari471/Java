package labpack;

public class Employee extends Person {
	int salary;
	public Employee(String firstName, String lastName, int salary) { //constructor
		super(firstName, lastName);
		this.salary = salary;
	}
	public int getSalary() { //getter
		return salary; 
	}

	    public static void main(String[] args) {
	        // Single Inheritance only inherit from person
	        Employee emp = new Employee("Arbaz", "Khan", 5);
	        System.out.println("Employee Name: " + emp.getFirstName() + " " + emp.getLastName());
	        System.out.println("Salary: " + emp.getSalary()+"LPA");
	        System.out.println();
}
}


