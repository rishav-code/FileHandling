package input;

import java.io.FileWriter;
import java.util.Scanner;
/*
 *  class logindetails used to login .
 *  Try catch block is used to handle the Exception for invalid input
 */

public class logindetails {

	private static String username = "rishav";
	private static int password = 12345;

	public static void main(String[] args) {
		try {

			Scanner input = new Scanner(System.in);
			System.out.println("Enter Username");
			String uname = input.nextLine();
			System.out.println("Enter password");
			int pass = input.nextInt();

			if (username.equals(uname) && password == pass) {
				// Object of menu Created andd Usermenu method called
				Mainmenu mm = new Mainmenu();
				mm.Usermenu();
			} else {
				System.out.println("Invalid Username and Password");

			}

		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println("Invalid input!! please input a valid exception");
		}
	}

}
