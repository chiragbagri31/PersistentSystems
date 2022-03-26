import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text from the document");
        String text = sc.nextLine();

        System.out.println("Enter the string to be found in the data");
        String input = sc.nextLine();

        String timmedInput = input.trim();
        if(text.contains(timmedInput))
        {
            System.out.println("String is found in the document");
        }
        else
        {
            System.out.println("String is not found in the document");
        }
    }
}
