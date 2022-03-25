import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
       	Scanner sc = new Scanner(System.in);

       	System.out.println("Enter the numbers :");
       	int num1 = sc.nextInt();
       	int num2 = sc.nextInt();
       	int num3 = sc.nextInt();

		int largestNumber = 0;
       	if(num1 >= num2) 
	   	{
            if(num1 >= num3) 
			{
				largestNumber = num1;
			}
            else 
			{
				largestNumber = num3;
			}
       	} 

	   	else 
		{
            if(num2>=num3)
			{
				largestNumber = num2;
			}
            else
			{
				largestNumber = num3;
			}
       	}

       	System.out.println(largestNumber + " is the greatest number");
    }
}
