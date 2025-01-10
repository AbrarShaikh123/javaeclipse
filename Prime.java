package Java;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to take input
        System.out.print("Enter a number: ");
        int numb = sc.nextInt(); // Read the number

        int count = 0; // Initialize count to 0

        // Loop to check divisors
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) { // Check if numb is divisible by i
                count++; // Increment count if divisible
                break; // Exit loop as it's not a prime number
            }
        }

        // Check the value of count to determine if the number is prime
        if (numb <= 1) {
            System.out.println(numb + " is not a prime number."); // Numbers <= 1 are not prime
        } else if (count == 0) {
            System.out.println(numb + " is a prime number."); // Prime if no divisors found
        } else {
            System.out.println(numb + " is not a prime number."); // Not prime otherwise
        }
    }
}
