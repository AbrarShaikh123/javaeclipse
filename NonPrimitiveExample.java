package Java;
// Example of Non-Primitive Data Types
public class NonPrimitiveExample {
    public static void main(String[] args) {
        // String (Non-Primitive)
    	
        String name = "Amit"; // Stores a sequence of characters
        System.out.println("Name: " + name);

        // Array (Non-Primitive)
        int[] marks = {85, 90, 95}; // Stores multiple integer values
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);

        // Class and Object (Non-Primitive)
        Student student = new Student(); // Student is a user-defined class
        student.setDetails("Rahul", 20);
        student.printDetails();

        // Null reference (Non-Primitive)
        String unknown = null; // Reference with no value
        System.out.println("Unknown: " + unknown);
    }
}

// A user-defined class (Non-Primitive Data Type)
class Student {
    String name; // String is non-primitive
    int age;     // Primitive type

    // Method to set student details
    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print student details
    void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
