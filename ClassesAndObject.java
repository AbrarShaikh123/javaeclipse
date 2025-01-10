package Java;

// Class banai
class Car1 {
    // Properties (Attributes)
    String color;
    String model;
    int speed;

    // Behavior (Methods)
    void start() {
        System.out.println("Car is starting");
    }

    void stop() {
        System.out.println("Car is stopping");
    }
}

public class ClassesAndObject {
    public static void main(String[] args) {
        // Object create kiya (Car1 class ka instance)
        Car1 myCar = new Car1();  // Use Car1 here instead of Car

        // Properties set ki
        myCar.color = "Red";
        myCar.model = "Tesla";
        myCar.speed = 200;

        // Methods call ki
        myCar.start();
        System.out.println("Car color: " + myCar.color);
        System.out.println("Car model: " + myCar.model);
        System.out.println("Car speed: " + myCar.speed + " km/h");
        myCar.stop();
    }
}
