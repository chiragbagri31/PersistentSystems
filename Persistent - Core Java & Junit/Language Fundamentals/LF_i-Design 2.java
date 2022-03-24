import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Temparature in Celsius:");
		int temp = sc.nextInt();

		double feren = (temp*(9.0/5.0)) + 32d;
		System.out.print("\nTemparature in Fahrenheit is " + feren + "F");
	}
}
