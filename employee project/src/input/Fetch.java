package input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/*
 * 
 *   Fetch contains methods to fetch using name and id 
 */

public class Fetch extends CreatEmployee {

	public void fetch(int Emp_id) throws FileNotFoundException {
		File file = new File("C:\\Users\\rishav.kumar\\eclipse-workspace\\output123123.txt");
		FileReader filereader = new FileReader(file);
		Scanner input = new Scanner(filereader);

		while (input.hasNextLine()) {
			String[] str = input.nextLine().split(" ");
			if (str[1].equalsIgnoreCase(Integer.toString(Emp_id))) {
				for (String p : str) {
					System.out.print(p + " ");
				}
			}
		}
	}

	public void fetch(String Emp_name) throws FileNotFoundException {
		File file = new File("C:\\Users\\rishav.kumar\\eclipse-workspace\\output123123.txt");
		FileReader filereader = new FileReader(file);
		Scanner input = new Scanner(filereader);

		while (input.hasNextLine()) {
			String[] str = input.nextLine().split(" ");
			if (str[0].equalsIgnoreCase(Emp_name)) {
				for (String p : str) {
					System.out.print(p + " ");
				}
			}
		}
	}

}
