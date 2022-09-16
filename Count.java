import java.util.*;
class Count
{
public static void main(String args[])
{
	Scanner x=new Scanner(System.in);
	int num,count=0,num1;
	System.out.print("enter a number: ");
	num=x.nextInt();
	num1=num;
	while(num>0)
	{
		num/=10;
		count+=1;

	}
	System.out.println("length of "+num1+" is "+count);
}
}