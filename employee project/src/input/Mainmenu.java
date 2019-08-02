package input;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/*
 *  class contains the main menu to select the desired operation
 */

public class Mainmenu {
	public void Usermenu() throws FileNotFoundException {
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Menu:Select The option");
			System.out.println("1:Creat Employee");
			System.out.println("2:Fetch Employee");
			System.out.println("3:Delete Employee");
			System.out.println("4:Exit");
			int Select = input.nextInt();
			mainmenu(Select);
		} while (1 > 0);
	}

	private void mainmenu(int select) throws FileNotFoundException {
		switch (select) {
		case 1:
			CreatEmployee ce = new CreatEmployee();
			try {
				ce.creatmethod();
			} catch (Myexception e) {
				System.out.println("some problem occured");

			} catch (IOException e) {
				System.out.println("some more problem occured");

			}
			break;
		case 2:
			Fetchmenu fm = new Fetchmenu();
			fm.fetchmenu();
			break;

		case 3:
			Deletemenu dm = new Deletemenu();
			try {
				dm.deletemenu();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found");
			}
			break;

		case 4:

		default:
			System.out.println("Wrong Option, Please select Correct Option");
		}
		// TODO Auto-generated method stub

	}
}
