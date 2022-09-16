import java.util.*;
class EvenOrOdd1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);

	long n;
	System.out.print("enter a number: ");
	n=sc.nextLong();
	if(n%2==0)
		System.out.println("Even number");
	else
		System.out.println("odd number");
	

}
}