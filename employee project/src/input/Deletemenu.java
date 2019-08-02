package input;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/*
 *  class Deletemenue to select option to delete using Switch Statment
 */

public class Deletemenu {
	public void deletemenu() throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Menu:Select The option to Delete");
		System.out.println("1:Using Name");
		System.out.println("2:Fetch Id");
		System.out.println("3:Exit");

		int Type_search = scan.nextInt();
		/*
		 * In this Method, Program take input of user choice and select the case
		 * accordingly
		 * 
		 */
		Delete d = new Delete();
		switch (Type_search) {
		case 1:
			System.out.println("Please enter the name of an employee");
			scan.nextLine();
			String newname = scan.nextLine();
			try {
				d.delete(newname);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found");
			}

			break;

		case 2:

			System.out.println("Please enter the id of an employee");
			int newid = scan.nextInt();
			d.delete(newid);

			break;

		case 3:
			System.out.println("Exit");
			System.exit(0);

		default:
			System.out.println("Invalid input !!! Try again");

		}

	}
}
