import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name :");
		char[] name = sc.next().toCharArray();
		String nameStr = new String(name);

		System.out.println("Enter the Creator Name :");
		char[] creator  = sc.next().toCharArray();
		String creatorStr = new String(creator );

		System.out.println("Enter the Purpose :");
		char[] purpose  = sc.next().toCharArray();
		String purposeStr = new String(purpose );

		System.out.println("Memory Space :");
		int memorySpace = sc.nextInt();

		System.out.println("Speed :");
		float speed  = sc.nextFloat();

		System.out.println("My Details :");
		System.out.println("I am the Robot named " + nameStr + ".");
		System.out.println("I was created by " + creatorStr + ".");
		System.out.println("I am created for the purpose of " + purposeStr + ".");
		System.out.println("My memory space is around " +  memorySpace + "Gb and my speed is " + speed + "Tb.");
	}
}
