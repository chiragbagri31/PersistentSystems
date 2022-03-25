import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main 
{
  public static void main(String[] args) throws ParseException 
	{
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter your choice:");
      System.out.println("1.Exhibition event");
      System.out.println("2.Stage event");

      int choice = sc.nextInt();
      sc.nextLine();

      System.out.print("Enter the details of ");
      if (choice == 1)
      {
        System.out.println("exhibition:");
      }
      else if(choice == 2)
      {
        System.out.println("stage event:");
      }

      String[] input = sc.nextLine().split(",");

      System.out.println("Enter the starting date of the event:");
      String start = sc.nextLine();

      System.out.println("Enter the ending date of the event:");
      String end = sc.nextLine();

      SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
      Date startDate = sdf.parse(start);
      Date endDate = sdf.parse(end);

      long milliDiff = endDate.getTime() - startDate.getTime();
      long days = milliDiff / 86400000;

      if(choice == 1)
      {
        Exhibition e = new Exhibition(input[0], input[1], input[2], input[3], Double.parseDouble(input[4]), Integer.parseInt(input[5]));
        System.out.println("The GST to be paid is Rs." + e.getGst(days));
      }

      else if(choice == 2)
      {
        StageEvent se = new StageEvent(input[0], input[1], input[2], input[3], Double.parseDouble(input[4]), Integer.parseInt(input[5]));
        System.out.println("The GST to be paid is Rs." + se.getGst(days));
      }
    }
}


// Event.java
public class Event 
{
	private String name;
	private String detail;
	private String type;
	private String ownerName;
	private double costPerDay;
	private double gst;

	Event(String name, String detail, String type, String ownerName, double costPerDay, double gst)
	{
		this.name = name;
		this.detail = detail;
		this.type = type;
		this.ownerName = ownerName;
		this.costPerDay = costPerDay;
		this.gst = gst;
	}

	public double getCostPerDay()
	{
		return costPerDay;
	}

	public double getGst()
	{
		return gst;
	}

	public double getGst(long days)
	{
		double gstAmount = (this.getCostPerDay() * this.getGst() * days)/100;
		return gstAmount;
	}
}


// Exhibition.java
public class Exhibition extends Event
{
	private int noOfStall;
	Exhibition(String name, String detail, String type, String ownerName, double costPerDay, int noOfStalls)
	{
		super(name, detail, type, ownerName, costPerDay, 5);
		this.noOfStall = noOfStall;
	}
}


// StageEvent.java
public class StageEvent extends Event
{
	private int noOfSeats;

	StageEvent(String name, String detail, String type, String ownerName, double costPerDay, int noOfSeats)
	{
		super(name, detail, type, ownerName, costPerDay, 15);
		this.noOfSeats = noOfSeats;
	}
}
