package input;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Class contains two delete methods using name ,using Id
 */
public class Delete extends CreatEmployee {
	public void delete(int Emp_id) throws IOException {
		File file = new File("C:\\Users\\rishav.kumar\\eclipse-workspace\\output123123.txt");
		File file2 = new File("C:\\Users\\rishav.kumar\\eclipse-workspace\\output222222.txt");
		FileReader filereader = new FileReader(file);
		FileWriter filewriter = new FileWriter(file2);
		Scanner input = new Scanner(filereader);

		while (input.hasNextLine()) {
			String[] str = input.nextLine().split(" ");
			if (!str[1].equalsIgnoreCase(Integer.toString(Emp_id))) {
				for (String p : str) {
					filewriter.write(p + " ");
				}
				filewriter.write("\n");
			}
			filewriter.close();
			exchange();

			System.out.println("Successfully Deleted:" + Emp_id);

		}
	}

	public void delete(String name) throws IOException {
		File file = new File("C:\\Users\\rishav.kumar\\eclipse-workspace\\output123123.txt");
		File file2 = new File("C:\\Users\\rishav.kumar\\eclipse-workspace\\output222222.txt");
		FileReader filereader = new FileReader(file);
		FileWriter filewriter = new FileWriter(file2);
		Scanner input = new Scanner(filereader);

		while (input.hasNextLine()) {
			String[] str = input.nextLine().split(" ");
			if (!str[1].equalsIgnoreCase(name)) {
				for (String p : str) {
					filewriter.write(p + " ");
				}
				filewriter.write("\n");
			}
			System.out.println("Successfully Deleted:" + name);

			filewriter.close();
			exchange();
		}
	}

	/*
	 * Exchange method is used to transfer the data of the new file into our parent
	 * file.
	 */
	public void exchange() throws IOException, ArrayIndexOutOfBoundsException {
		FileReader filereader = new FileReader("C:\\Users\\rishav.kumar\\eclipse-workspace\\output123123.txt");
		FileWriter filewriter = new FileWriter("C:\\Users\\rishav.kumar\\eclipse-workspace\\output222222.txt");
		Scanner input = new Scanner(filereader);
		while (input.hasNextLine()) {
			String[] str1 = input.nextLine().split(" ");
			for (String x : str1) {
				filewriter.write(x + " ");
			}
			filewriter.write("\n");
		}
		input.close();
		filereader.close();
		filewriter.close();

	}

}

/*
 * { Iterator<Pojo> itr = list.iterator(); while(itr.hasNext());
 * 
 * Pojo pj=itr.next(); if(pj.Emp_id == Emp_id); itr.remove();
 * System.out.println("Deleted the details"); itr.remove();
 * 
 * 
 * 
 * }
 * 
 * }
 */
