package Java;

class Employee {
String name;
int id;
double salary;


void displayDetails() {
	System.out.println("Employee Name: " + name);
    System.out.println("Empolyee ID: " + id);
    System.out.println("Empolyee Salary: " + salary);
}
}

public class Company {
public static void main(String[] args) {
    
	Employee emp1 = new Employee(); 
    emp1.name = "Abrar";  
    emp1.id = 111;
    emp1.salary = 90000;
   
    Employee emp2 = new Employee(); 
    emp2.name = "Fardin";
    emp2.id = 112;
    emp2.salary =65000;

    Employee emp3 = new Employee(); 
    emp3.name = "Huzefa";
    emp3.id = 113;
    emp3.salary =70000;

    
    emp1.displayDetails();
    System.out.println();
    emp2.displayDetails();
    System.out.println();
    emp3.displayDetails();
}
}