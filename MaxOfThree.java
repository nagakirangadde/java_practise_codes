import java.util.*;
class MaxOfThree
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int a,b,c;
System.out.print("Enter a value: ");
a=x.nextInt();
System.out.print("Enter b value: ");
b=x.nextInt();
System.out.print("Enter c value: ");
c=x.nextInt();
if(a>b && a>c)
	System.out.println(a+" is greater");
else if(b>a && b>c)
	System.out.println(b+" is greater");
else if(c>a && c>b)
	System.out.println(c+" is greater");
}
}


