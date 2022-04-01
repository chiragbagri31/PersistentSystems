// Main.java
import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the airport");
        String name = sc.nextLine();

        System.out.println("Enter the city name");
        String cityName = sc.nextLine();

        System.out.println("Enter the country code");
        String countryCode = sc.nextLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter("airport.csv"));
        bw.write(String.format("%s,%s,%s", name, cityName, countryCode));
        bw.close();
    }
}
