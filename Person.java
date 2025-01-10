							   //classes And Object
package Java;
class Person {
    // Attributes (Instance Variables)
    String name;
    int age;

    // Constructor to initialize attributes
    Person(String name, int age) {
        this.name = name; // 'this' refers to the current object's variable
        this.age = age;
    }

    // Method (Behavior)
    void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // Another Method
    void birthday() {
        age++; // Increment age by 1
        System.out.println("Happy Birthday " + name + "! You are now " + age + " years old.");
    }
//}
//
//public class Main {
    public static void main(String[] args) {
        // Create Object 1
        Person person1 = new Person("Abrar", 23); // Create and initialize an object
        person1.introduce(); // Call method to display introduction
        person1.birthday();  // Call method to celebrate birthday

        // Create Object 2
        Person person2 = new Person("Huzefa", 21);
        person2.introduce();
        person2.birthday();
    }
}
