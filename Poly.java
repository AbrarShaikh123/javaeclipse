package Java;

// Define the Calculator class
class Polymorphism {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Define the main class
public class Poly {  // Poly means (many)
    public static void main(String[] args) {
        // Create an object of the Calculator class
    	Polymorphism calc = new Polymorphism();

        // Calling overloaded methods
        System.out.println("Addition of two integers: " + calc.add(10, 20));
        System.out.println("Addition of three integers: " + calc.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + calc.add(10.5, 20.5));
    }
}
