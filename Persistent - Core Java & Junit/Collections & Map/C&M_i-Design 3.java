// Main.java
import java.util.*;

@SuppressWarnings("unchecked")

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of address");
		int n = sc.nextInt();

		Map<String,List<Address>> map = new HashMap();
		sc.nextLine();

		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the address " + (i+1) + " detail");
			String inputString = sc.nextLine();

			String[] input = inputString.split(",");
			Address ad = new Address(input[0], input[1], input[2], input[3], Integer.parseInt(input[4]));
		
			if(map.containsKey(input[2]))
			{
				map.get(input[2]).add(ad);
			}
			else
			{
				map.put(input[2], new ArrayList<Address>());
				map.get(input[2]).add(ad);
			}
		}

		System.out.println("Enter the city to be searched");
		String city = sc.nextLine();

		if(map.containsKey(city))
		{
			System.out.println(String.format( "%-15s %-15s %-15s %-15s %s" , "Line 1","Line 2","City","State","Pincode"));
		
			for (Address ad : map.get(city)) 
			{
				System.out.println(String.format( "%-15s %-15s %-15s %-15s %s" , ad.getAddressLine1(),ad.getAddressLine2(),ad.getCity(),ad.getState(),ad.getPincode()));
			}
		}
		else
		{
			System.out.println("Searched city not found");
		}
	}
}



// Address.java
public class Address 
{
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int pincode;

    Address(){}

    Address(String addressLine1, String addressLine2, String city, String state, int pincode)
    {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    // addressLine1 getter and setter
    public void setAddressLine1(String addressLine1) 
    {
		this.addressLine1 = addressLine1;
	}
    public String getAddressLine1() 
    {
		return addressLine1;
	}
	
    // addressLine2 getter and setter
    public void setAddressLine2(String addressLine2) 
    {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine2() 
    {
		return addressLine2;
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
	
    // pincode getter and setter
    public void setPincode(int pincode) 
    {
		this.pincode = pincode;
	}
	public int getPincode() 
    {
		return pincode;
	}
}
