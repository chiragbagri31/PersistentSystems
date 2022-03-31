// Main.java
import java.util.*;
public class Main 
{
	public static void main(String[] args)throws Exception 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the user details");
		String inputStr = sc.nextLine();

		String[] input = inputStr.split(",");

		User u = new User(input[0], input[1], input[2], input[3]);
		try
		{
			UserBO ubo = new UserBO();
			ubo.validate(u); 
			System.out.println(u.toString());
		}
		catch(WeakPasswordException e)
		{
			System.out.println(e);
		}
	}
}



// User.java
public class User 
{
	private String name;
	private String mobile;
	private String username;
	private String password;
	
	public User(){}
	
	public User(String name, String mobile, String username, String password) 
	{
		this.name = name;
		this.mobile = mobile;
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

	// mobile getter and setter
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
	public String getMobile() 
	{
		return mobile;
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
	
	public String toString() {
		return "Name:"+name+"\n"
				+ "Mobile:"+mobile+"\n"
				+ "Username:"+username+"\n"
				+ "Password:"+password;
	}
}



// UserBO.java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserBO 
{
	public static void validate(User user)throws WeakPasswordException
    {
       	if(!(user.getPassword().length()>=10 && user.getPassword().length()<=20 
	   	    && (user.getPassword().matches(".*[a-z].*") ||
    		user.getPassword().matches(".*[A-Z].*")) &&
    		user.getPassword().matches(".*[0-9].*") && 
    		Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE).matcher(user.getPassword()).find())) 
       	{
            throw new WeakPasswordException("Your password is weak");
       	}
    }
}



// WeakPasswordException.java
public class WeakPasswordException extends Exception 
{
	String msg;
	public WeakPasswordException(String msg) 
	{
		this.msg = msg;
	}

	public String toString() 
	{
		return "WeakPasswordException: " + msg;
	}
}
