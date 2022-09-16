import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner x= new Scanner(System.in);
int n,sum=0,rem,temp;
System.out.println("enter a number");
n=x.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
sum=sum*10+rem;
n/=10;
}
System.out.println("Reverse: "+sum);
if(sum==temp)
	System.out.println("palindrome");
else
	System.out.println("Not a palindrome");
}
}