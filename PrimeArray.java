import java.util.*;
class PrimeArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
boolean flag=true;
System.out.print("enter the array size: ");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	System.out.print("Enter number "+(i+1)+": ");
	arr[i]=sc.nextInt();
}
for(int ele:arr)
{
	if(ele>1)
		{
			for(int i=2;i<ele;i++)
				{
					if(ele%i==0)
						{
							System.out.println(ele+" is not a prime");
							flag=false;
							break;
						}
				}
			if(flag)
				System.out.println(ele+" is prime");
		}
	else
		System.out.println("number should be greater than 1");
}
}
}