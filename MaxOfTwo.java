import java.util.*;
class MaxOfTwo
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int a,b;
System.out.print("Enter a value: ");
a=x.nextInt();
System.out.print("Enter a value: ");
b=x.nextInt();
if(a>b)
	System.out.println(a+" is greater");
else if(a<b)
	System.out.println(b+" is greater");
else
	System.out.println("both are equal");
}
}


