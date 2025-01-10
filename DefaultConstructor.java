package Java;

class Demo {

    // Instance variable
    int value;

    // Default Constructor
    Demo() {
        value = 0;  // Default value assigned
        System.out.println("Default Constructor Called.");
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

// Main.java
public class DefaultConstructor {
    public static void main(String[] args) {
    	Demo obj = new Demo(); // Default constructor call hoga
        obj.display();
    }
}
