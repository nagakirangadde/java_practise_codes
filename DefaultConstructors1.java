import java.util.*;
class Dc
{
	String name;
	int age;
	Dc()
	{
		name="nagakiran";
		age=22;
	}
	double method1()
	{
		System.out.println("My name is : "+name);
		System.out.println("My age is : "+age);
		double A=3.14*age*age;
		return A;
	}
}
class DefaultConstructors1
{
public static void main(String args[])
{
Dc obj=new Dc();
double area=obj.method1();
System.out.println("Area of circle: "+area);
}
}