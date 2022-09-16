import java.util.*;
class Sum_of_digits
{
public static void main(String args[])
{
	Scanner x=new Scanner(System.in);
	int num,sum=0,num1,rem;
	System.out.print("enter a number: ");
	num=x.nextInt();
	num1=num;
	while(num>0)
	{
		rem=num%10;
		sum+=rem;
		num/=10;	

	}
	System.out.println("sum of digits of "+num1+" is "+sum);
}
}