// Main.java
import java.util.*;
public class Main 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name of the staff:");
		String staffName = sc.nextLine();

		System.out.println("Enter the staff designation:");
		String designation = sc.nextLine();

		System.out.println("Enter the department name:");
		String departmentName = sc.nextLine();

		Department d = new Department(staffName, designation, departmentName);
		d.displayStaff();
	}
}


// Department.java
public class Department 
{
	private String departmentName;
	private Staff staff;

	Department(String a, String b, String c)
	{
		staff = new Staff(a, b);
		departmentName = c;
	}
	public void displayStaff() 
	{
		System.out.print(staff.getStaffName() + " is working in the " + departmentName + " department as " + staff.getDesignation());
	}
}


// Staff.java
public class Staff 
{
	private String staffName;
	private String designation;

	Staff(String a, String b)
	{
		staffName = a;
		designation = b;
	}

	public String getStaffName()
	{
		return staffName;
	}

	public String getDesignation()
	{
		return designation;
	}
}
