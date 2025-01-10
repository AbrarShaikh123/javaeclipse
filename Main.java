package Java;

 class Abdul {  
    String brand;
    int speed;
    
     void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
    	Abdul car1 = new Abdul(); 
        car1.brand = "Nano";   
        car1.speed = 150;
        
        Abdul car2 = new Abdul(); // Create another object for Car
        car2.brand = "Wagon R";
        car2.speed = 200;
        
        car1.displayDetails();
        car2.displayDetails();
    }
}

