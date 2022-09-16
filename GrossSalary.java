import java.util.*;
class GrossSalary
{
public static void main(String args[])
{
int bs,hra,da;
float gross;
Scanner x= new Scanner(System.in);
System.out.print("Enter Basic Salary: ");
bs=x.nextInt();

if(bs<=10000)
{
	gross=bs+(float)(0.2*bs)+(float)(0.8*bs);
	System.out.println("your Gross salary is: "+gross); 

}
else if(bs >10000 && bs<=20000)
{
	gross=bs+(float)(0.25*bs)+(float)(0.9*bs);
	System.out.println("your Gross salary is: "+gross); 

}
else if(bs>20000)
{
	gross=bs+(float)(0.3*bs)+(float)(0.95*bs);
	System.out.println("your Gross salary is: "+gross); 

}


 
}

}
