// Main.java
import java.util.*;
public class Main 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of seats to be booked:");
		int n = sc.nextInt();
		
		int s = 0;

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
					s = sc.nextInt();
					if(s>100 || s<0)
					{
						throw new ArrayIndexOutOfBoundsException();
					}
					else
					{
						seat[i] = s;
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
			System.out.println("java.lang.ArrayIndexOutOfBoundsException: " + (s - 1));
		}
	}
}
