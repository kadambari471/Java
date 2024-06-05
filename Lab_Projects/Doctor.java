package Lab_Projects;

// Base class Doctor
class Doctor {
    // Method to perform surgery
    public void surgery() {
        System.out.println("Performing surgery");
    }
}

// Derived class Surgeon that extends Doctor
class Surgeon extends Doctor {
    // Inherits the surgery() method from Doctor
}

// Derived class Nurse that extends Doctor
class Nurse extends Doctor {
    // Method to provide treatment
    public void treatment() {
        System.out.println("Providing treatment");
    }
}

// Main class to test the hierarchy
class Hospital {
    public static void main(String[] args) {
        // Creating an instance of Doctor and calling surgery method
        Doctor doctor = new Doctor();
        doctor.surgery();
        
        // Creating an instance of Surgeon and calling inherited surgery method
        Surgeon surgeon = new Surgeon();
        surgeon.surgery();
        
        // Creating an instance of Nurse and calling treatment method
        Nurse nurse = new Nurse();
        nurse.treatment();
    }
}
