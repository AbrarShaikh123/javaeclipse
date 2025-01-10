package Java;
public class starpattern {
    public static void main(String[] args) {
        int n = 7; // This defines the width of the largest row (odd number)

        // First half of the pattern
        for (int i = 0; i < n / 2 + 1; i++) {
            // Printing leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half of the pattern
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Printing leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
