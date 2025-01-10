package Java;
import java.util.Scanner; // Scanner class ko import karte hain

public class forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner ka object banate hain
        System.out.print("Enter a number: "); // User se number input lene ke liye prompt
        int number = scanner.nextInt(); // User se number input lete hain
        
        // For loop se 1 se lekar user ke dwara diya gaya number tak print karte hain
        for (int i = 1; i <= number; i++)
        if(i<number)
        {
            System.out.print(i + ","); // Har number ko print karte hain
        }
        else
        {
        	System.out.println(i +".");
            	
        }
    }
}
