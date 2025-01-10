package Java;

import java.util.Scanner;

public class Notification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for user inputs
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Payment Amount: ");
        int payAmount = scanner.nextInt();

        // Output message
        System.out.println(name + ", you have sent $" + payAmount + " via Google Pay.");

        // Closing scanner
        scanner.close();
    }
}
