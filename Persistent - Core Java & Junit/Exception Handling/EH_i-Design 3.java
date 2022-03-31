// Main.java
import java.util.*;
public class Main 
{
	public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the contact details");
        String inputStr = sc.nextLine();
        String[] input = inputStr.split(",");
        
        ContactDetail cd = new ContactDetail(input[0], input[1], input[2], input[3], input[4]);
        try
        {
            // passing mobile and alternateMobile
            ContactDetailBO.validate(input[0],input[1]);
            System.out.println(cd.toString());
        }
        catch(DuplicateMobileNumberException e)
        {
            System.out.println(e);
        }
	}
}



// ContactDetail.java
public class ContactDetail 
{
    private String mobile;
	private	String alternateMobile;
	private	String landLine;
	private	String email;
	private String address;

	public ContactDetail(){}

	public ContactDetail(String mobile, String alternateMobile, String landLine, String email, String address) 
	{
		this.mobile = mobile;
		this.alternateMobile = alternateMobile;
		this.landLine = landLine;
		this.email = email;
		this.address = address;
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
	
	// alternateMobile getter and setter
	public void setAlternateMobile(String alternateMobile) 
	{
		this.alternateMobile = alternateMobile;
	}
	public String getAlternateMobile() 
	{
		return alternateMobile;
	}
	
	// landLine getter and setter
	public void setLandLine(String landLine) 
	{
		this.landLine = landLine;
	}
	public String getLandLine() 
	{
		return landLine;
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
	
	// address getter and setter
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getAddress() 
	{
		return address;
	}
	
    public String toString()
    {
        return "Mobile:" + getMobile() + 
			   "\nAlternate mobile:" + getAlternateMobile() +
			   "\nLandLine:" + getLandLine() +
			   "\nEmail:" + getEmail() +
			   "\nAddress:" + getAddress();
    }
}



// ContactDetailBO.java
public class ContactDetailBO 
{
	public static void validate(String mobile,String AlternateMobile) throws DuplicateMobileNumberException
     {
          if(mobile.equals(AlternateMobile)) 
          {
               throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
          }
     }
}



// DuplicateMobileNumberException.java
public class DuplicateMobileNumberException extends Exception
{
	String msg;
	public DuplicateMobileNumberException(String msg) 
	{
		this.msg = msg;
	}

	public String toString()
	{
		return "DuplicateMobileNumberException: " + msg;
	}
}    
