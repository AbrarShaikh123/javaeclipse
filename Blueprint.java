package Java;

public class Blueprint {
    public static void main(String[] args) {
        // Create an instance of the Brand class
        Brand myBrand = new Brand();

        // Set attributes for the object
        myBrand.brand = "Wagon R";
        myBrand.color = "Gray";
        myBrand.speed = 100;
        myBrand.teatime = "tea";

        // Call methods
        myBrand.drive();
        myBrand.stop();
        myBrand.teatime();
    }
}
