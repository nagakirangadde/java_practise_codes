import java.util.*;
class Rectangle
{
	public int l,b;
	public 	int a,p;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public int area()
	{
		a=l*b;
		return a;
	}
	public int perimeter()
	{
		p=2*(l+b);
		return p;
	}
}
class AreaOfRectangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");		
		int l=sc.nextInt();
		System.out.print("Enter breadth: ");
		int b=sc.nextInt();
		Rectangle obj=new Rectangle(l,b);
		System.out.println("Area of Circle is: "+obj.area());
		System.out.println("Circumference of Circle is: "+obj.perimeter());
		
			
	}
}