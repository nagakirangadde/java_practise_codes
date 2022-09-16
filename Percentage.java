import java.util.*;
class Percentage
{
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	int n,total,sum=0;
	float per;
	System.out.print("enter the number of subjects: ");
	n=sc.nextInt();
	int arr[]=new int[n];
	total=n*100;
	for(int i=0;i<n;i++)
	{
		System.out.print("Enter subject "+(i+1)+ " marks: ");
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		sum+=arr[i];
	}
	per=((float)sum/total)*100;
	System.out.println("percentage: "+per);
	

}
}