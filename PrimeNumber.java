import java.util.*;
class PrimeNumber
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter a number: ");
	int n=sc.nextInt();
	if(n>1)
	{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
			continue;
		else
		System.out.println("prime");
	}
	
	}
	else
		System.out.println("Enter a valid number");
	
}
}