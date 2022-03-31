// Main.java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main 
{
	public static void main(String[] args) throws FileNotFoundException
	{	
		BufferedReader br=new BufferedReader(new FileReader("input.csv"));
		
		UserBO ubo = new UserBO();
		
		List<User> li = ubo.readFromFile(br);
		System.out.println(String.format("%-15s %-20s %-15s %s","Name","Email","Username","Password"));

		ubo.display(li);
	}
}



// User.java
public class User
{
	private String name;
	private String email;
	private String username;
	private String password;

	public User() {}
	
	public User(String name, String email, String username, String password) 
	{
		super();
		this.name = name;
		this.email = email;
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

	// email getter and setter
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getEmail() 
	{
		return email;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class UserBO 
{
	public List<User> readFromFile(BufferedReader br)
	{
		ArrayList<User> ur = new ArrayList<User>(); 
		try
		{
			String line;
			while((line=br.readLine()) != null)
			{
				String[] str = line.split(",");
				User u = new User(str[0], str[1], str[2], str[3]);
				ur.add(u);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return ur;
	}


	public void display(List<User> list)
	{
		if(list.size()>0)
		{
			for(User item : list)
			{
				System.out.println(String.format("%-15s %-20s %-15s %s", item.getName(), item.getEmail(), item.getUsername(), item.getPassword()));
			}
		}
		else
		{
			System.out.println("The list is empty");
		}
	}
}
