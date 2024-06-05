package labpack;

public class Manager extends Employee {
	String post;
	public Manager(String firstName, String lastName, int salary, String post) { //Constructor
		super(firstName, lastName, salary);
		this.post = post;
	}

	public String getPost() { //getter
		return post;
	}
	public static void main(String[] args) {
		 // Multi-Level Inheritance extended from Employee and Person
		Manager manager = new Manager("Arbaz ","Khan ",19,"Developer");
		System.out.println("Manager Name "+manager.firstName+""+manager.lastName);
		System.out.println("Salary: " + manager.getSalary()+"LPA");
		System.out.println("Post: " + manager.getPost());
	    System.out.println();
	}
}
