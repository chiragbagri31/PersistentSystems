import java.util.*;
public class Main 
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number of halls:");
		int n = sc.nextInt();

		ArrayList<String> ar = new ArrayList<String>();
		sc.nextLine();

		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the Hall Name " + (i+1));
			String inp = sc.nextLine();
			ar.add(inp);
		}

		System.out.println("Enter the hall name to be searched:");
		String foundString = sc.nextLine();

		if(ar.contains(foundString))
		{
			System.out.println(foundString + " hall is found in the list at position " + ar.indexOf(foundString));
		}
		else
		{
			System.out.println(foundString + " hall is not found");
		}
	}
}
