import java.util.*;
class Factorial
{
public static void main(String args[])
{
	Scanner x=new Scanner(System.in);
	int num,fact=1,num1;
	System.out.print("enter a number: ");
	num=x.nextInt();
	num1=num;
	while(num>=1)
	{
		fact*=num;
		num--;
	}
	System.out.println("factorial of "+num1+ " is "+fact);
}
}