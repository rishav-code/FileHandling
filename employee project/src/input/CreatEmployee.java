package input;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * CreatEmployee class used to take input from user and store in a ArrayList
 */

public class CreatEmployee {
	static ArrayList<Data> list = new ArrayList<Data>();

	@SuppressWarnings("resource")
	public void creatmethod() throws Myexception, IOException {
		FileWriter fw = new FileWriter("C:\\Users\\rishav.kumar\\eclipse-workspace\\output123123.txt", true);
		Scanner input = new Scanner(System.in);

		try {

			System.out.println("Enter the Proffessional details of the employee");
			System.out.println("Enter Employee Name");
			String Emp_Name = input.nextLine();
			input.nextLine();
//Custom Exception implementation

			System.out.println("Enter Employee Id");
			int Emp_Id = input.nextInt();
			if (Emp_Id == 0) {
				throw new Myexception("Employee Id cant be zero");
			}
			input.nextLine();
			System.out.println("Enter Employee Department");
			String Emp_Department = input.nextLine();
			System.out.println("Enter Employee Designation");
			String Emp_Designation = input.nextLine();
			System.out.println();
			System.out.println("Enter the Personal details of the employee");
			System.out.println("Enter Employee Gender ");
			String Emp_gender = input.nextLine();
			System.out.println("Enter Employee Address");
			String Emp_adds = input.nextLine();
			System.out.println("Enter Employee Age");
			int Emp_age = input.nextInt();
			list.add(new Data(Emp_Name, Emp_Id, Emp_Department, Emp_Designation, Emp_gender, Emp_adds, Emp_age));
			System.out.println("Size=  " + list.size());
			System.out.println("Emp Details created");
			fw.write(Emp_Name);
			fw.write(" ");
			fw.write(Integer.toString(Emp_Id));
			fw.write(" ");
			fw.write(Emp_Department);
			fw.write(" ");
			fw.write(Emp_Designation);
			fw.write(" ");
			fw.write(Emp_gender);
			fw.write(" ");
			fw.write(Emp_adds);
			fw.write(" ");
			fw.write(Integer.toString(Emp_age));
			fw.write(" ");
		} catch (Exception e) {
			System.out.println("Emp not created in file");
			CreatEmployee ce1 = new CreatEmployee();
			ce1.creatmethod();

		}
		System.out.println("File created");
		fw.close();
	}

}
