// Main.java
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of User details to be added");
        int n = sc.nextInt();
        sc.nextLine();

        UserBO ubo = new UserBO();
        ubo.addAll(UserBO.getList());

        for (int i=0; i<n; i++) 
		{
            System.out.println("Enter the user " + (i + 1) + " detail in csv format");
			String inputStr = sc.nextLine();

            String[] input = inputStr.split(",");
            User u = new User(input[0], input[1], input[2], input[3]);

            ubo.add(u);
        }

        System.out.println("Name                Contact Number      Username            Email               ");
        for (User u : ubo) 
		{
            u.display();
        }

        System.out.println("Enter the range to be removed from array list");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        ubo.removeUser(n1, n2);

        System.out.println("Name                Contact Number      Username            Email               ");
        for (User u : ubo) 
		{
            u.display();
        }
    }
}




// User.java
public class User
{
    private String name;
    private String contactNumber;
    private String userName;
    private String email;

    public User(){}

    public User(String name, String contactNumber, String userName, String email) 
    {
        super();
        this.name = name;
        this.contactNumber = contactNumber;
        this.userName = userName;
        this.email = email;
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
    
    // contactNumber getter and setter
    public void setContactNumber(String contactNumber)
    {
        this.contactNumber = contactNumber;
    }
    public String getContactNumber() 
    {
        return contactNumber;
    }
    
    // userName getter and setter
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getUserName() 
    {
        return userName;
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
   
    void display() 
    {
        System.out.println(String.format("%-20s%-20s%-20s%-20s", this.name,this.contactNumber,this.userName,this.email));
    }
}



// UserBO.java
import java.util.ArrayList;

public class UserBO extends ArrayList<User>
{
    public static UserBO getList()
	{
		UserBO u = new UserBO();
		u.add(new User("mohan Raja","9874563210","mohan","mohan@abc.in"));
		u.add(new User("arjun Ravi","4324237","arjun","arjun@abc.in"));
		u.add(new User("Arun kumar","9845671230","arun","arun@abc.in"));
		u.add(new User("prakash raj","7548921445","prakash","raj@abc.in"));
		
		return u;
	}

    void removeUser(int n1,int n2) 
	{
    	this.removeRange(n1, n2);
    }
}
