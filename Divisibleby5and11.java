import java.util.*;
class Divisibleby5and11
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int a;
System.out.print("Enter a value: ");
a=x.nextInt();

if(a%5==0 and a%11==0)
	System.out.println(a+" is divisible by both 5 and 11);
else 
	System.out.println(a+" is not is divisible by both 5 and 11");
}
}


