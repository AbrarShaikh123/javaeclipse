package Java;

// Abstract class
abstract class AnimalDemo {  // Renamed to Demo (CamelCase)
    abstract void sound();  // Abstract method

    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Dog class extends Demo
class Dog extends AnimalDemo {
    void sound() {
        System.out.println("Barking");
    }
}

// Cat class extends Demo
class Cat extends AnimalDemo {
    void sound() {
        System.out.println("Meowing");
    }
}

// Main class to run the program
public class AbstractPets {  // Renamed to AbstractPets (CamelCase)
    public static void main(String[] args) {
        // Creating Dog object
        Dog dog = new Dog();
        dog.sound();  // Output: Barking
        dog.sleep();  // Output: Sleeping...

        // Creating Cat object
        Cat cat = new Cat();
        cat.sound();  // Output: Meowing
        cat.sleep();  // Output: Sleeping...
    }
}
