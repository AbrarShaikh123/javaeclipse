package Java;

class add {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    } 
    
    int Subtract(int a, int b) {
        return a - b;
    }
    
    // Method to add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Calculator {
    public static void main(String[] args) {
        add calc = new add();
        System.out.println("Addition of 2 numbers: " + calc.add(20, 30));
        System.out.println("Subtract of 2 numbers: " + calc.Subtract(2025, 2001));// 2 parameters
        System.out.println("Addition of 3 numbers: " + calc.add(5, 10, 15)); // 3 parameters
    }
}
