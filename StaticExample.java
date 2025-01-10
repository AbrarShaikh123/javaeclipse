package Java;
class StaticExample {

    // Static variable
    static int count = 0;

    // Instance variable
    int instanceVar;

    // Constructor
    StaticExample() {
        count++; // Static variable ko increment karte hain
        instanceVar = count;
    }

    // Static method
    static void displayCount() {
        System.out.println("Total Objects Created: " + count);
    }
    

    // Instance method
    void displayInstanceVar() {
        System.out.println("Instance Variable Value: " + instanceVar);
    }

    // Static block
    static {
        System.out.println("Static Block Executed - Class Loaded");
    }

    public static void main(String[] args) {
        // Static block ab tak execute ho chuka hoga
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();

        // Static method ko class ke through call karte hain
        StaticExample.displayCount();

        // Instance method call
        obj1.displayInstanceVar();
        obj2.displayInstanceVar();
        obj3.displayInstanceVar();
    }
}
