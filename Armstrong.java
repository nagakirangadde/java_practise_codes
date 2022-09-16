import java.util.*;
class Armstrong
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int num,count=0,temp,rem,num1,sum=0;
System.out.print("enter a number: ");
num=x.nextInt();
num1=num;
temp=num;
while(num>0)
{
	num/=10;
	count+=1;
}
while(num1>0)
{
	rem=num1%10;
	sum+=(int)Math.pow(rem,count);
	num1/=10;
}
if(temp==(int)sum)
	System.out.println("Armstrong number");
else
	System.out.println("Not an Armstrong number");	

}
}
