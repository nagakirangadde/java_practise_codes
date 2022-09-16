class Parent
{
	Parent()
	{
		System.out.println("non parameter of Parent class");
	}
	Parent(int x)
	{
		System.out.println("parameter of Parent class");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("non parameter of child class");
	}
	Child(int x)
	{
		System.out.println("parameter of child class");
	}
	
}
class InheritanceParameterisedConstructor
{
	public static void main(String args[])
	{
	Child c=new Child();
	}
}

