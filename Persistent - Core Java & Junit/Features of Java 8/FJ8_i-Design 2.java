// Main.java
import java.io.*;
import java.util.*;
public class Main
{
   public static void main(String[] args) throws IOException
   {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of events");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Event> eventList = new ArrayList<>();

        System.out.println("Enter event details in CSV(Event Name,Organiser Name,Event Cost)");
        for(int i=0; i<n; i++)
        {
            String inputStr = sc.nextLine();
            String[] input = inputStr.split(",");
            
            Event e = new Event(input[0], input[1], Double.parseDouble(input[2]));
            eventList.add(e);
        }

        Event.display(eventList);
   }
}



// Event.java
import java.util.*;
public class Event
{
    public String eventName;
    public String organiserName;
    public double eventCost;

    Event(){}

    Event(String eventName, String organiserName, double eventCost)
    {
        this.eventName = eventName;
        this.organiserName = organiserName;
        this.eventCost = eventCost;
    }

    // eventName getter and setter
    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }
    public String getEventName()
    {
        return eventName;
    }

    // organiserName getter and setter
    public void setOrganiserName(String organiserName)
    {
        this.organiserName = organiserName;
    }
    public String getOrganiserName()
    {
        return organiserName;
    }

    // eventCost getter and setter
    public void setEventCost(double eventCost)
    {
        this.eventCost = eventCost;
    }
    public double getEventCost()
    {
        return eventCost;
    }

    static void display(List<Event> eventList)
    {
       eventList.forEach(
           (n)-> System.out.println(n)
       );
    }
    public String toString()
    {
       return getEventName() + "|" + getOrganiserName() + "|" + getEventCost();
    }
}   
