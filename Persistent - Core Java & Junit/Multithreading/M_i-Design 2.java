// Main.java
import java.util.*;
@SuppressWarnings("unchecked")
public class Main 
{
	public static void main(String[] args) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of users:");
		int n1 = sc.nextInt();	
		sc.nextLine();

		ArrayList<User> ur = new ArrayList<>();
		// for entering n1 number of userDetails
		for(int i=0; i<n1; i++)
		{
			System.out.println("Enter the details of user " + (i+1));
			String userDetailStr = sc.nextLine();

			String[] userDetail = userDetailStr.split(",");

			User u = new User(userDetail[0], userDetail[1], userDetail[2], userDetail[3]);
			ur.add(u);
		}

		System.out.println("Enter the number of cities:");
		int n2 = sc.nextInt();
		sc.nextLine();

		ArrayList<String> output = new ArrayList<String>();
		// for entering n2 number of cities
		for(int i=0; i<n2; i++)
		{
			System.out.println("Enter the name of city " + (i+1));
			String cityName = sc.nextLine();

			CityCount cc = new CityCount(cityName, ur);
			cc.start();
			cc.join();

			output.add(cityName + "--" + cc.getCount());
		}

		// Printing Output
		for (String string : output) 
		{
			System.out.println(string);
		}
	}
}



// CityCount.java
import java.util.*;
public class CityCount extends Thread
{
	private String city;
	private int count;
	private List<User> userList;

	public CityCount(String city, ArrayList<User> userList)
	{
		super();
		this.city = city;
		this.userList = userList;
	}

	// city getter and setter
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getCity() 
	{
		return city;
	}

	// count getter and setter
	public void setCount(int count) 
	{
		this.count = count;
	}
	public int getCount() 
	{
		return count;
	}

	// userList getter and setter
	public void setUserList(List<User> userList) 
	{
		this.userList = userList;
	}
	public List<User> getUserList() 
	{
		return userList;
	}

	@Override
	public void run() 
	{	
		for (User user : userList) 
		{
			if(user.getCity().equals(this.city))
			{
				this.count += 1;
			}
		}
	}
}



// User.java
public class User 
{
	private String name;
	private String mobileNumber;
	private String city;
	private String state;

	User(){}

	User(String name, String mobileNumber, String city, String state) 
	{
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.state = state;
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

	// city getter and setter
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}

	// state getter and setter
	public void setState(String state)
	{
		this.state = state;
	}
	public String getState()
	{
		return state;
	}
}
