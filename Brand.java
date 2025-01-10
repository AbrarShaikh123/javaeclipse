package Java;

public class Brand {
    String brand;
    String color;
    int speed; // Variable name corrected to follow conventions
    String teatime;

    // Method to simulate driving
    void drive() {
        System.out.println(brand + " car is running at " + speed + " km/h");
    }

    // Method to simulate stopping
    void stop() {
        System.out.println(brand + " car has stopped.");
    }
    void teatime() {
        System.out.println(brand + " car has stopped  for tea .");
    }
}
