package Java;

//public class MultiDimensionlArray {
//	  public static void main(String[] args) {
//		    int[][] myNumbers = { {1, 2, 3, 4}, 
//		                    		{5, 6,7} };
//		    System.out.println(myNumbers[1][1]);  
//		  }
//		}

public class MultiDimensionlArray {
    public static void main(String[] args) {
        // 2D array declare aur initialize karna
        int[][][] matrix = {
            {
            	{1, 2},
            	{3, 4}
            },
            
            {
            	{5, 6},
            	{7, 8}
            },
            {
            	{9,10},
            	{11,12}
            },
            {
            	{13,14},
            	{15,16}
            }
            
        };
        
        // 2D array ke elements ko print karna
        System.out.println(matrix[0][0][0]); // 1
        System.out.println(matrix[0][0][1]);
        System.out.println(matrix[0][1][0]);
        System.out.println(matrix[0][1][1]);
        System.out.println(matrix[1][0][0]);
        System.out.println(matrix[1][0][1]);
        System.out.println(matrix[1][1][0]);
        System.out.println(matrix[1][1][1]);
        System.out.println(matrix[2][0][0]);
        System.out.println(matrix[2][0][1]);
        System.out.println(matrix[2][1][0]);
        System.out.println(matrix[2][1][1]);
        System.out.println(matrix[3][0][0]);        
        System.out.println(matrix[3][0][1]);
        System.out.println(matrix[3][1][0]);
        System.out.println(matrix[3][1][1]);
        
    }
}
