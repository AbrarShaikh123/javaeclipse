package Java;

class Scotter { // Renamed to "Scooter" for better readability
    int Speed;       // Speed of the scooter
    String Colour;   // Colour of the scooter
    String Brand;    // Brand of the scooter

    // Constructor to initialize the fields
    Scotter() {
        Brand = "Avnish";
        Colour = "Blue";
        Speed = 125;
    }
}

public class Avnish {
    public static void main(String[] args) {
        Scotter myScooter = new Scotter();  // Create a Scotter object

        // Access fields of the Scotter object
        System.out.println("Brand: " + myScooter.Brand);
        System.out.println("Colour: " + myScooter.Colour);
        System.out.println("Speed: " + myScooter.Speed);
    }
}
