// Main.java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of users:");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<User> ur = new ArrayList<User>();

		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the details of user :" + (i+1));
			String inputStr = sc.nextLine();

			String[] input = inputStr.split(",");
			User u = new User(input[0], input[1], input[2], input[3]);

			ur.add(u);
		}

		BufferedWriter br = new BufferedWriter(new FileWriter("output.csv"));
		UserBO ubo = new UserBO();
		ubo.writeFile(ur, br);
		br.close();
	}
}



// User.java
public class User
{
	private String name;
	private String mobileNumber;
	private String username;
	private String password;

	public User() {}
	
	public User(String name, String mobileNumber, String username, String password) 
	{
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;
	}
	
	// name getter and setter
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}

	// mobileNumber getter and setter
	public void setMobileNumber(String mobileNumber) 
	{
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumber() 
	{
		return mobileNumber;
	}

	// username getter and setter
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getUsername() 
	{
		return username;
	}

	// password getter and setter
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getPassword() 
	{
		return password;
	}
}



// UserBO.java
import java.io.BufferedWriter;
import java.util.ArrayList;

public class UserBO 
{
	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception 
	{
		for(User item : userList) 
		{
			bw.write(String.format("%s,%s,%s,%s\n", item.getName(),item.getMobileNumber(),item.getUsername(),item.getPassword()));	
		}
		bw.close();
	}
}
