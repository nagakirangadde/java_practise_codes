import java.util.*;
public class CountryWisePopulation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("no. of countries: ");
        int size=sc.nextInt();
        String country[]=new String[size];
        int pop[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("enter country name: ");
            country[i]=sc.nextLine();
        }
        for(int i=0;i<size;i++)
        {
           System.out.print("enter population: ");
            pop[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.println("Country name: " + country[i] + " population: " + pop[i]);
        }
    }
}



























