package Java;
 class Pazrameter {
 // Instance variable
 String Name;

 // Parameterized Constructor
 Pazrameter(String x) {
     Name = x;
     System.out.println("My name is " + Name);
 }

 void display() {
     // Printing the Name
     System.out.println("Name: " + Name);
 }
}

//PazrameterizedConstructor.java
public class PazrameterizedConstructor {
 public static void main(String[] args) {
     // Creating an object with the constructor
     Pazrameter obj = new Pazrameter("Abrar");
     obj.display();
 }
}
