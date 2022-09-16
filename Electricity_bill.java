import java.util.*;
class Electricity_bill
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int units;
float bill,total_bill;
System.out.print("enter units: ");
units=x.nextInt();

if(units<=50)
{
	bill=(float)(units*1.50);
	total_bill=bill+(float)(0.2*bill);
	System.out.println("your Electricity bill is: "+bill);
	System.out.println("your Electricity bill is: "+total_bill);
}
else if(units>=51 && units<=150)
{
	bill=(float)(50*1.5+(units-50)*2.15);
	total_bill=bill+(float)(0.2*bill);
	System.out.println("your Electricity bill is: "+bill);
	System.out.println("your Electricity bill is: "+total_bill);

}
if(units>=151 && units<=250)
{
	bill=(float)(50*1.5+100*2.15+(units-150)*3.20);
	total_bill=bill+(float)(0.2*bill);
	System.out.println("your Electricity bill is: "+bill);
	System.out.println("your Electricity bill is: "+total_bill);

}
if(units>250)
{
	bill=(float)(50*1.5+100*2.15+100*3.2+(units-250*5.50));
	total_bill=bill+(float)(0.2*bill);
	System.out.println("your Electricity bill is: "+bill);
	System.out.println("your Electricity bill is: "+total_bill);

}
}
}