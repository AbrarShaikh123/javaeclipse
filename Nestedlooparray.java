package Java;
public class Nestedlooparray {
    public static void main(String[] args) {
        // 3D array declare aur initialize
        int[][][] matrix = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            },
            {
                {13, 14, 15},
                {16, 17, 18}
            }
        };

        // Nested loops ka use karke elements print karna
        for (int layer = 0; layer < matrix.length; layer++) {
            System.out.println("Layer " + layer + ":");
            for (int row = 0; row < matrix[layer].length; row++) {
                for (int column = 0; column < matrix[layer][row].length; column++) {
                    System.out.print(matrix[layer][row][column] + " ");
                }
                System.out.println(); // Row complete hone eke baad new line
            }
            System.out.println(); // Layer complete hone ke baad new line
        }
    }
}