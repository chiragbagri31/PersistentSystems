// Main.java
import java.util.*; 
import java.util.stream.*; 

class Main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter expense for food");
        int food = sc.nextInt();

        System.out.println("Enter expense for rent");
        int rent = sc.nextInt();

        System.out.println("Enter expense for shopping");
        int shopping = sc.nextInt();

        System.out.println("Enter expense for groceries");
        int groceries = sc.nextInt();

        System.out.println("Enter expense for electricity");
        int electricity = sc.nextInt();

        System.out.println("Enter salary");
        int salary = sc.nextInt();

        float sum = (float)food+rent+shopping+groceries+electricity;
        if(sum<=salary)
        {
            System.out.println("Savings amount will be Rs." + (float)(salary - sum));
        }
        else
        {
            System.out.println("Expenses exceeds Salary");
        }
    }
}
