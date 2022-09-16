import java.util.*;
class Rect
{
	private int length;
	private int breadth;
	
	public int getLength()
	{
		return length;
	}
	public void setLength(int l)
	{
		length=l;

	}
	public int getBreadth()
	{
		return breadth;
	}
	public void setBreadth(int b)
	{
		breadth=b;
	}


	int area(int l,int b)
	{
		return length*breadth;
	}
	int perimeter(int l,int b)
	{
		return 2*(length+breadth);
	}
	boolean isSquare(int l,int b)
	{
		if(length==breadth)
			return true;
		else
			return false;
	}
}
class Rectangle1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int b=sc.nextInt();
Rect obj=new Rect();
obj.setLength(l);
obj.setBreadth(b);
System.out.println("Area: "+obj.area(l,b));
System.out.println("Perimeter: "+obj.perimeter(l,b));
System.out.println("is square: "+obj.isSquare(l,b));
}
}