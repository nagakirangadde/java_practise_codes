import java.util.*;
class Circle
{
	public double r,c;
	public 	double a;
	Circle(double r,double c)
	{
		this.r=r;
		this.c=c;
	}
	public double area()
	{
		a=Math.PI*r*r;
		return a;
	}
	public double circumference()
	{
		c=2*Math.PI*r;
		return c;
	}
}
class AreaOfCircle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius: ");		
		double r=sc.nextDouble();
		System.out.print("Enter circumference: ");
		double c=sc.nextDouble();
		Circle obj=new Circle(r,c);
		System.out.println("Area of Circle is: "+obj.area());
		System.out.println("Circumference of Circle is: "+obj.circumference());
		
			
	}
}