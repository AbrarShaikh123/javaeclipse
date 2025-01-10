 										//Default Constructor.
package Java;
class Animal {
    // Attributes
    String name;

    // Default Constructor
    Animal() {
        name = " is King of the Jungle"; // Default value
        System.out.println("Whic Animal is king of the junle");
    }

    // Method
    void display() {
        System.out.println("Lion:" + name);
    }
//}
//
//public class Animal {
    public static void main(String[] args) {
        Animal animal = new Animal(); // Default constructor automatic call hoga
        animal.display(); // Default name print karega
    }
}
