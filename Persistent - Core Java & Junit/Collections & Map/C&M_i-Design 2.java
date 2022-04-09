import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		HashSet<String> set = new HashSet<String>();

		while (true) 
		{
			System.out.println("Enter Email address");
			String inp = sc.nextLine();
	
			set.add(inp);

			System.out.println("Do you want to Continue?(yes/no)");
			String choice = sc.nextLine();

			if (choice.equals("no")) 
			{
				break;
			}
		}

		System.out.println("Enter the email addresses to be searched separated by comma");
		String sea = sc.nextLine();

		String[] data=sea.split(",");
		List<String> lis=Arrays.asList(data);

		HashSet<String> ts = new HashSet<String>(lis);

		if (set.containsAll(ts)) 
		{
			System.out.println("Email addresses are present");	
		}
		else 
		{
			System.out.println("Email addresses are not present");
		}
	}
}
