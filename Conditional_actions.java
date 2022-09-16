import java.util.*;
class Conditional_actions
{
public static void main(String args[])
{
Scanner x= new Scanner(System.in);
int n;
System.out.print("enter a number: ");
n=x.nextInt();
if(n>=1 && n<=100)
{
	if((n%2!=0)||(n%2==0 && n>=6 && n<=20))

		System.out.println("weird");

	else if((n%2==0 && n>=2 && n<=5)||(n%2==0 && n>20))

		System.out.println("Not Weird");


}
else

	System.out.println("Please enter a valid number");

}
}

