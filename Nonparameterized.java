package Java;

public class Nonparameterized {
	String name;
	int year;
    int age;
    String Birthdate;
    String Address;
    String City;
    String dialog;
    

    // Non-parameterized constructor
    Nonparameterized() {
        name = "Abrar"; // Default value
        age = 25; // Default value
        year = 2001;
        Address = "Ghorpadi Goan ";
        Birthdate = "11/01/2001";
        City="Pune";
    }

    void display() {
        System.out.println("Name :" + name);
        System.out.println("Year:" + year);
        System.out.println("Birth Date:" + Birthdate);
        System.out.println("Age: " + age);
        System.out.println("Address:"+ Address);
        System.out.println("City:" + City);
    }
//}
//
//public class Main {
    public static void main(String[] args) {
    	Nonparameterized s1 = new Nonparameterized(); // Object create kiya
        s1.display(); // Output: Name: Unknown, Age: 0
    }
}



