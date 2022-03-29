// Main.java
import java.util.*;
public class Main 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Item type details:");
		System.out.println("Enter the name:");
		String name = sc.nextLine();

		System.out.println("Enter the deposit:");
		String depositStr = sc.nextLine();

		try
		{
			double deposit = Double.parseDouble(depositStr);
			System.out.println("Enter the cost per day:");
			String costPerDayStr = sc.nextLine();
			try
			{
				double costPerDay = Double.parseDouble(costPerDayStr);
				ItemType it = new ItemType(name, deposit, costPerDay);
				System.out.println(it.toString());
			}
			catch(NumberFormatException e)
			{
				System.out.println("java.lang.NumberFormatException: For input string: \"" + costPerDayStr + "\"");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("java.lang.NumberFormatException: For input string: \"" + depositStr + "\"");
		}
	}
}



// ItemType.java
public class ItemType 
{
    private String name;
    private double deposit;
    private double costPerDay;

    ItemType(){}

    ItemType(String name, double deposit, double costPerDay)
    {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
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

    // deposit getter and setter
    public void setDeposit(double deposit)
    {
        this.deposit = deposit;
    }
    public double getDeposit()
    {
        return deposit;
    }

    // costPerDay getter and setter
    public void setCostPerDay(double costPerDay)
    {
        this.costPerDay = costPerDay;
    }
    public double getCostPerDay()
    {
        return costPerDay;
    }

    @Override
    public String toString() 
    {
        return "The details of the item type are:" +
                "\nName:" + getName() +
                "\nDeposit:" + getDeposit() +
                "\nCost Per Day:" + getCostPerDay();
    }
}
