import java.util.*;
import java.text.*;
public class Main
{
	public static void main(String[] args) throws Exception
        {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
                SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");

                Date d = sdf.parse(sc.nextLine());

                sdf = new SimpleDateFormat("EEE, MMM d, yy");
                System.out.println("Date Format with EEE, MMM d, yy : "+sdf.format(d));

                sdf = new SimpleDateFormat("dd.MM.yyyy");
                System.out.println("Date Format with dd.MM.yyyy : "+sdf.format(d));

                sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println("Date Format with dd dd/MM/yyyy : "+sdf.format(d));
	}
}
