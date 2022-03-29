// Main.java
import java.util.*;
public class Main 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of seats to be booked:");
		int n = sc.nextInt();

		try
		{
			// if no of seats are >100 or <0 then throw Exception else run the code
			if(n>100 || n<0)
			{
				throw new ArrayIndexOutOfBoundsException();
			}

			else
			{
				int[] seat = new int[n];
				for(int i=0; i<n; i++)
				{
					System.out.println("Enter the seat number " + (i+1));
					seat[i] = sc.nextInt();
					if(seat[i]>100 || seat[i]<0)
					{
						throw new ArrayIndexOutOfBoundsException();
					}
				}

				// prints seats booked
				System.out.println("The seats booked are:");
				for(int i=0; i<n; i++)
				{
					System.out.println(seat[i]);
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException: 100");
		}
	}
}
