// Mains.java
import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Stall Type");
        System.out.println("1)Gold Stall");
        System.out.println("2)Premium Stall");
        System.out.println("3)Executive Stall");

        int choice = sc.nextInt();

        if (choice == 1) 
        {
            sc.nextLine();
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");
            String[] input = sc.nextLine().split(",");
            GoldStall stall = new GoldStall();
            stall.setStallName(input[0]);
            stall.setCost(Integer.parseInt(input[1]));
            stall.setOwnerName(input[2]);
            stall.setTvSet(Integer.parseInt(input[3]));
            stall.display();
        } 
        
        else if (choice == 2) 
        {
            sc.nextLine();
            String[] input;
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
            input = sc.nextLine().split(",");
            PremiumStall stall = new PremiumStall();
            stall.setStallName(input[0]);
            stall.setCost(Integer.parseInt(input[1]));
            stall.setOwnerName(input[2]);
            stall.setProjector(Integer.parseInt(input[3]));
            stall.display();
        } 
        
        else if (choice == 3) 
        {
            sc.nextLine();
            String[] input;
            System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
            input = sc.nextLine().split(",");
            ExecutiveStall stall = new ExecutiveStall();
            stall.setStallName(input[0]);
            stall.setCost(Integer.parseInt(input[1]));
            stall.setOwnerName(input[2]);
            stall.setScreen(Integer.parseInt(input[3]));
            stall.display();
        } 
        
        else 
        {
            System.out.println("Invalid Stall Type");
        }
    }
}



// Stall.java
public interface Stall 
{
 	abstract void display();
}



// GoldStall.java
public class GoldStall implements Stall
{
	private String stallName;
	private int cost;
	private String ownerName;
	private int tvSet;

	// setters for all objects(not needed written just because of validation)
	public void setStallName(String stallName) 
	{
        this.stallName = stallName;
    }
    public void setCost(int cost) 
	{
        this.cost = cost;
    }
    public void setOwnerName(String ownerName) 
	{
        this.ownerName = ownerName;
    }
    public void setTvSet(int tvSet) 
	{
        this.tvSet = tvSet;
    }

	public void display()
	{
		System.out.println("Stall Name:" + stallName);
        System.out.println("Cost:" + cost + ".Rs");
        System.out.println("Owner Name:" + ownerName);
        System.out.println("Number of TV sets:" + tvSet);
	}
}



// PremiumStall.java
public class PremiumStall implements Stall
{
	private String stallName;
	private int cost;
	private String ownerName;
	private int projector;

	// setters for all objects(not needed written just because of validation)
	public void setStallName(String stallName) 
	{
        this.stallName = stallName;
    }
    public void setCost(int cost) 
	{
        this.cost = cost;
    }
    public void setOwnerName(String ownerName) 
	{
        this.ownerName = ownerName;
    }
    public void setProjector(int projector) 
	{
        this.projector = projector;
    }

	public void display()
	{
		System.out.println("Stall Name:" + this.stallName);
        System.out.println("Cost:" + this.cost + ".Rs");
        System.out.println("Owner Name:" + this.ownerName);
        System.out.println("Number of Projectors:" + this.projector);
	}
}



// ExecutiveStall.java
public class ExecutiveStall	implements Stall
{
	private String stallName;
	private int cost;
	private String ownerName;
	private int screen;

	// setters for all objects(not needed written just because of validation)
	public void setStallName(String stallName) 
	{
        this.stallName = stallName;
    }
    public void setCost(int cost) 
	{
        this.cost = cost;
    }
    public void setOwnerName(String ownerName) 
	{
        this.ownerName = ownerName;
    }
    public void setScreen(int screen) 
	{
        this.screen = screen;
    }

	public void display()
	{
		System.out.println("Stall Name:" + this.stallName);
        System.out.println("Cost:" + this.cost + ".Rs");
        System.out.println("Owner Name:" + this.ownerName);
        System.out.println("Number of Screens:" + this.screen);
	}
}
