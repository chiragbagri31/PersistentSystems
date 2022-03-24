// Main.java
import java.util.*;
public class Main 
{
	public static void main(String args[]) throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your account number:");
		String accountNumber = sc.next();

		System.out.println("Enter the balance of the account:");
		double balance = sc.nextDouble();

		System.out.println("Enter the type of transfer to be made:");
		System.out.println("1.NEFT\n2.IMPS\n3.RTGS");
		int choice = sc.nextInt();

		// for NEFT
		if(choice == 1)
		{
			NEFTTransfer neft = new NEFTTransfer(accountNumber, balance);
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();

			if(neft.validate(transfer) == true)
			{
				if(neft.transfer(transfer) == true)
				{
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + neft.getBalance());
				}
				else
				{
					System.out.println("Transfer could not be made");
				}
			}
			else
			{
				System.out.println("Account number or transfer amount seems to be wrong");
			}
		}
		
		// for IMPS
		else if(choice == 2)
		{
			IMPSTransfer imps = new IMPSTransfer(accountNumber, balance);
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();

			if(imps.validate(transfer) == true)
			{
				if(imps.transfer(transfer) == true)
				{
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + imps.getBalance());
				}
				else
				{
					System.out.println("Transfer could not be made");
				}
			}
			else
			{
				System.out.println("Account number or transfer amount seems to be wrong");
			}
		}

		// for RTGS
		else if(choice == 3)
		{
			RTGSTransfer rtgs = new RTGSTransfer(accountNumber, balance);
			System.out.println("Enter the amount to be transferred:");
			double transfer = sc.nextDouble();

			if (rtgs.validate(transfer) == true)
			{
				if (rtgs.transfer(transfer) == true) 
				{
					System.out.println("Transfer occurred successfully");
					System.out.println("Remaining balance is " + rtgs.getBalance());
				} 
				else
				{
					System.out.println("Transfer could not be made");
				}
			}	
			else
			{
				System.out.println("Account number or transfer amount seems to be wrong");
			}
		}
	}
}



// FundTransfer.java
public abstract class FundTransfer 
{
	private String accountNumber;
	private double balance;

	Boolean validate(double transfer)
	{
		if(accountNumber.length()==10 && transfer>0 && transfer<balance)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	abstract Boolean transfer(double transfer);


	// accountNumber getter and setter
	public void setAccountNumber(String a)
	{
		accountNumber = a;
	}
	public String getAccountNumber()
	{
		return accountNumber;
	}

	// balance getter and setter
	public void setBalance(double a)
	{
		balance = a;
	}
	public double getBalance()
	{
		return balance;
	}
}



// NEFTTransfer.java
public class NEFTTransfer extends FundTransfer
{
	protected double balance;

	// constructor
	NEFTTransfer(String accountNumber, double balance)
	{
		setAccountNumber(accountNumber);
		setBalance(balance);
	}

	Boolean transfer(double transfer)
	{
		balance = getBalance();
		double totalTransferAmount = transfer + (0.05 * transfer);

		if(totalTransferAmount < balance)
		{
			balance = balance - (transfer + (0.05 * transfer));
			setBalance(balance);
			return true;
		}
		else
		{
			return false;
		}
	}
}



// IMPSTransfer.java
public class IMPSTransfer extends FundTransfer 
{
	protected double balance;

	// constructor
	IMPSTransfer(String accountNumber, double balance)
	{
		setAccountNumber(accountNumber);
		setBalance(balance);
	}

	Boolean transfer(double transfer)
	{
		balance = getBalance();
		double totalTransferAmount = transfer + (0.02*transfer);

		if(totalTransferAmount < balance)
		{
			balance = balance - (transfer + (0.02 * transfer));
			setBalance(balance);
			return true;
		}
		else
		{
			return false;
		}
	}	
}



// RTGSTransfer.java
public class RTGSTransfer extends FundTransfer
{
	protected double balance;

	// constructor
	RTGSTransfer(String accountNumber, double balance)
	{
		setAccountNumber(accountNumber);
		setBalance(balance);
	}

	Boolean transfer(double transfer)
	{
		balance = getBalance();
		if(transfer>10000.0)
		{
			balance = balance - transfer;
			setBalance(balance);
			return true;
		}
		else
		{
			return false;
		}
	}	
}
