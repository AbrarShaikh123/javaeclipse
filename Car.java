
package Java;


class Fardin {  
    String brand;
    int speed;

    
    void Details() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


public class Car {
    public static void main(String[] args) {
        
        Fardin car1 = new Fardin(); 
        car1.brand = "Nano";   
        car1.speed = 150;

        
        Fardin car2 = new Fardin(); 
        car2.brand = "Wagon R";
        car2.speed = 200;

        
        car1.Details();
        car2.Details();
    }
}
