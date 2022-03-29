// Main.java
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
        Item[] array = new Item[n];
        
        for (int i = 0; i < n; i++) 
        {
            String[] input = sc.nextLine().split("[$]");
            Item item = new Item(input[0], input[1], Integer.parseInt(input[2]), Integer.parseInt(input[3]));
            array[i] = item;
        }

        System.out.println("Items:");
        for(int i=0;i<n;i++)
        {
            Item item = array[i];
            StringBuilder sb = new StringBuilder(item.toString());
            if(item.getAvailableQuantity() > 0)
            {
                System.out.println(sb.append("Available"));
            }
            else
            {
                System.out.println(sb.append("Not Available"));
            }
        }
    }
}



// Item.java
public class Item 
{
	private String name;
	private String type;
	private int cost;
	private int availableQuantity;

	Item(){}

	Item(String name, String type, int cost, int availableQuantity)
	{
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.availableQuantity = availableQuantity;
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

	// type getter and setter
	public void setType(String type)
	{
		this.type = type;
	}
	public String getType()
	{
		return type;
	}

	// cost getter and setter
	public void setCost(int cost)
	{
		this.cost = cost;
	}
	public int getCost()
	{
		return cost;
	}

	// availableQuantity getter and setter
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}

	@Override
    public String toString() {
        return name + ',' +
                type + ',' +
                cost + ',';
    }
}
