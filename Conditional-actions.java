import java.util.*;
class Conditional_actions
{
public static void main(String args[])
{
Scanner x= new Scanner(System.in);
int n;
System.out.print("enter a number: ");
n=x.nextInt();
if(n%2!=0)
{
	System.out.println("weird");
}
else
{
if(n>=2 && n<=5)
{
System.out.println("Not Weird");
}
else if(n>=6 && n<=20)
{
System.out.println("Weird");
}
else if(n>20)
{
System.out.println("Not Weird");
}
}
}
}
