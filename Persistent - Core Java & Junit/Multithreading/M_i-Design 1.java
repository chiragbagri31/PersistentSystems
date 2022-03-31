// Main.java
import java.util.*;
public class Main 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		sc.nextLine();

		int total_articles = 0;

		for(int i=0; i<n; i++)
		{
			System.out.println("Enter line " + (i+1));
			String s = sc.nextLine();

			Article a = new Article(s);
			a.start();
			a.join();
			total_articles = total_articles + a.getCount();
		}
		System.out.println("There are " + total_articles + " articles in the given input");
	}
}



// Article.java
import java.util.*;
public class Article extends Thread
{
	private String line;
	private int count;

	Article(){}

	Article(String line)
	{
		this.line = line;
	}

	// line getter and setter
	public void setLine(String line)
	{
		this.line = line;
	}
	public String getLine()
	{
		return line;
	}

	// count getter and setter
	public void setCount(int count)
	{
		this.count = count;
	}
	public int getCount()
	{
		return count;
	}

	@Override
	public void run() 
	{
		String[] str = this.line.split(" ");
		for(String string : str)
		{
			if(string.toLowerCase().equals("a") || string.toLowerCase().equals("an") || string.toLowerCase().equals("the"))
			{
				count++;
			}
		}
	}
}
