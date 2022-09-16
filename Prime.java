import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number: ");
boolean flag=true;
int n=sc.nextInt();
if(n>1)
{
for(int i=2;i<n;i++)
{
	if(n%i==0)
		{
		System.out.println("not a prime");
		flag=false;
		break;
		}
		
}
}

else
System.out.println("Your number is invalid, number should be greater than 1");
if(flag)
System.out.println(n+" is a Prime number");	

}
}