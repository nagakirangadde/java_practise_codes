import java.util.*;
class Pc
{
	String name;
	int age;
	Pc(String n,int a)
	{
		name=n;
		age=a;
	}
	double method1()
	{
		System.out.println("My name is : "+name);
		System.out.println("My age is : "+age);
		double A=3.14*age*age;
		return A;
	}
}
class ParameterisedConstructors1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
int a=sc.nextInt();
Pc obj=new Pc(n,a);
double area=obj.method1();
System.out.println("Area of circle: "+area);
}
}