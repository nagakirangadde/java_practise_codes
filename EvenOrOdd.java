import java.util.*;
class EvenOrOdd
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int a;
System.out.print("Enter a value: ");
a=x.nextInt();

if(a%2==0)
	System.out.println(a+" is Even");
else if(a%2!==0)
	System.out.println(a+" is Odd");
}
}


