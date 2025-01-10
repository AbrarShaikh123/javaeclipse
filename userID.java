package Java;

import java.util.Scanner;

public class userID {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
		System.out.print("User Name:");
		String name = scanner.nextLine();
		
		System.out.print("Address:");
		String address = scanner.nextLine();
		
		System.out.print("Service:");
		String Service = scanner.nextLine();
		
//		System.out.print("Flat Num:");
//		int flatNum = scanner.nextInt();
		
		System.out.print("Mobile num:");
		Long MobileNum =scanner.nextLong();
	
		System.out.print("This is User ID: " + name + " / " + address +  " / "  + Service + " / " + MobileNum);

		scanner.close();
	}

}

