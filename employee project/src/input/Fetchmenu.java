package input;

import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 *  Fetchmenu class contains The  menu for fetch operations
 */

public class Fetchmenu {

	public void fetchmenu() throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Menu:Select The option to fech");
		System.out.println("1:Using Name");
		System.out.println("2:Fetch Id");
		System.out.println("3:Exit");

		int Type_search = scan.nextInt();

		switch (Type_search) {
		case 1:
			Fetch f = new Fetch();
			System.out.println("please enter the name of an employee");
			scan.nextLine();
			String newname = scan.nextLine();
			f.fetch(newname);
			break;

		case 2:
			Fetch f2 = new Fetch();
			System.out.println("please enter the id of an employee");
			int newid = scan.nextInt();
			f2.fetch(newid);
			break;

		case 3:
			System.out.println("Exit");
			System.exit(0);

		default:
			System.out.println("invalid input !!! Try again");

		}
	}
}
