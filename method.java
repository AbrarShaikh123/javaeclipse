package Java;

public class method {
    // Method to Mul two numbers
    int SubNumbers(int a, int b) {//--------------------------------
        return a - b;												//-
    }																//-
    																//-
    																//-
    public static void main(String[] args) {						//-
        method obj = new method(); // class Name Object creation	//-
        int result = obj.SubNumbers(11,10); // Method call  //----------
        System.out.println("Sub: " + result);
    }
}