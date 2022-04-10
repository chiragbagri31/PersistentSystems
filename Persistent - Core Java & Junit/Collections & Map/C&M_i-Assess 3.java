// Main.java
import java.util.*;
public class Main 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of address:");
		int n = sc.nextInt();
		sc.nextLine();

		Map<String, Map<String, Integer>> map = new TreeMap<>();

		for (int i = 0; i < n; i++) 
		{
            System.out.println("Enter the address:");
			String inputStr = sc.nextLine();

            String[] input = inputStr.split(",");
            String state = input[2];
            String city = input[1];

            if (map.containsKey(state)) 
			{
                Map<String, Integer> m = map.get(state);
                if(m.containsKey(city))
				{
					m.replace(city, m.get(city) + 1);
				} 
                else
				{
					m.put(city, 1);
				}
            } 
			else 
			{
                Map<String, Integer> m = new TreeMap<>();
                m.put(city, 1);
                map.put(state, m);
            }
        }

        System.out.println("Number of entries in city/state wise:");
        for (String state : map.keySet()) 
		{
            System.out.println("\nState:" + state);
			
            Map<String, Integer> m = map.get(state);
            for(String city : m.keySet()) 
			{
                System.out.println("City:" + city + " " + "Count:" + m.get(city));
            }
        }
	}
}
