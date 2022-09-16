import java.util.*;
class Circle
{
	public double r;
	double area()
	{
		return Math.PI*r*r;
	}
	double perimeter()
	{
		return 2*Math.PI*r;
	}
	double circumference()
	{
		return perimeter();
	}
}
class Cylinder extends Circle
{
	public double h;
	double volume()
	{
		return area()*h;
	}
}
class Inheritance1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Cylinder obj=new Cylinder();	
		System.out.print("enter radius: ");
		obj.r=sc.nextDouble();
		System.out.print("enter height: ");
		obj.h=sc.nextDouble();
		System.out.println("Volume of the cylinder: "+obj.volume());
		System.out.println("Volume of the circle: "+obj.area());
		System.out.println("Perimeter of the circle: "+obj.perimeter());


	}
}



