import java.util.*;
class PositiveOrNegative
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int a;
System.out.print("Enter a value: ");
a=x.nextInt();

if(a>0)
	System.out.println(a+" is Positive");
else if(a<0)
	System.out.println(a+" is Negative");
else 
	System.out.println("0 is Neither positive nor negative");
}
}


