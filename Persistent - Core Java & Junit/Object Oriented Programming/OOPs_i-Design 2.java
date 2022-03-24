// Mains.java
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
    Scanner sc = new Scanner(System.in);

		System.out.println("Choose Account Type");
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");

		int choice = sc.nextInt();
		
		String z = new String();

		if(choice == 1)
		{
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
		    z  = sc.next();
		    String tokens[]= z.split(",");
			SavingsAccount sa = new SavingsAccount(tokens[0],tokens[1],tokens[2],tokens[3]);
			sa.display();
		}
		else if(choice == 2)
		{
			System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
		    z = sc.next();
		    String[] token= z.split(",");
			CurrentAccount ca = new CurrentAccount(token[0],token[1],token[2],token[3]);
			ca.display();
		}
	}
}


// SavingsAccountjava
public class SavingsAccount extends Account
{
	private String orgName;

	SavingsAccount(){}

	SavingsAccount(String a, String b, String c, String d)
	{
		super(a, b, c);
		orgName = d;
	}

	public void display()
	{
		super.display();
		System.out.println("Organisation Name:" + orgName);
	}
}


// Account.java
public class Account 
{
	protected String accName;
	protected String accNo;
	protected String bankName;

	Account(){}
	Account(String a, String b, String c)
	{
		accName = a;
		accNo = b;
		bankName = c;
	}

	protected void display()
	{
		System.out.println("Account Name:"+accName);
		System.out.println("Account Number:"+accNo);
		System.out.println("Bank Name:"+bankName);
	}
}


// CurrentAccount.java
public class CurrentAccount extends Account
{
	private String tinNumber;

	CurrentAccount(){}

	CurrentAccount(String a, String b,String c,String d)
	{
		super(a, b, c);
		tinNumber = d;
	}

	public void display()
	{
		super.display();
		System.out.print("TIN Number:" + tinNumber);
	}
}
