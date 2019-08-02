package input;
/*
 *  Decleared and Stored the variables
 */

public class Data {

	public String Emp_name;
	public int Emp_id;
	public String Emp_Department;
	public String Emp_gender;
	public String Emp_adds;
	public int Emp_age;
	public String Emp_Desiganation;

	public Data(String emp_Name, int emp_Id, String emp_Department, String emp_Designation, String emp_gender,
			String emp_adds, int emp_age) {
		Emp_name = emp_Name;
		Emp_id = emp_Id;
		Emp_Department = emp_Department;
		Emp_gender = emp_gender;
		Emp_age = emp_age;
		Emp_Desiganation = emp_Designation;
		Emp_adds = emp_adds;
	}

	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getEmp_Department() {
		return Emp_Department;
	}

	public void setEmp_Department(String emp_Department) {
		Emp_Department = emp_Department;
	}
}
