// Main.java
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Customer Address");

		System.out.println("Enter the street");
		String street = sc.nextLine();

		System.out.println("Enter the city");
		String city = sc.nextLine();

		System.out.println("Enter the pincode");
		int pincode = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter the country");
		String country = sc.nextLine();

		Address a = new Address(street, city, pincode, country);
		a.displayAddress();
	}
}


// Address.jvaa
public class Address
{
	public String street;
	public String city;
	public int pincode;
	public String country;

	Address(String street, String city, int pincode, String country)
	{
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.country = country;
	}

	public void displayAddress()
	{
		System.out.println("Street: " + street);
		System.out.println("City: " + city);
		System.out.println("Pincode: " + pincode);
		System.out.println("Country: " + country);
	}
}
