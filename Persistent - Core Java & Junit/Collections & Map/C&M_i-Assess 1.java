// Main.java
import java.util.*;
import java.io.*;
@SuppressWarnings("unchecked")

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of users:");
		int n = Integer.parseInt(sc.nextLine());

		Set<User> set1 = new HashSet<>();
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter details of user" + (i+1));

			System.out.println("Username:");
			String username = sc.nextLine();
			System.out.println("Bank name:");
			String bankname = sc.nextLine();

			User u = new User(username, bankname);
			set1.add(u);
		}

		System.out.println("Enter username(Expire in one month) seperated by comma");
		String names = sc.nextLine();

		String[] data = names.split(",");
		Set<User> set2 = new HashSet();

		for (String string : data) 
		{
			User obj = new User(string, null);
			set2.add(obj);	
		}
		set1.retainAll(set2);
		
		Set<User> oset = new TreeSet<User>();
		oset.addAll(set1);
		
		int i = 1;
		System.out.println("Users going to expire within a month");
		for (User user : oset) 
		{
			System.out.println("User "+ i++);
			System.out.println("User Name = " + user.getUsername());
			System.out.println("Bank Name = " + user.getBankname());
		}
	}
}



// User.java
public class User implements Comparable<User>
{
	private String username;
	private String bankname;
	
	public User(){}

	public User(String username, String bankname) 
	{
		super();
		this.username = username;
		this.bankname = bankname;
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

	// bankname getter and setter
	public void setBankname(String bankname) 
	{
		this.bankname = bankname;
	}
	public String getBankname() 
	{
		return bankname;
	}

	@Override
	public boolean equals(Object o) 
	{
		return this.username.equals(((User)o).getUsername());
	}	
	
	@Override
	public int hashCode()
	{
	    return this.username.length();
	}
	
	@Override
	public int compareTo(User p)
	{
	    return this.username.compareTo(p.getUsername());
	}
}
