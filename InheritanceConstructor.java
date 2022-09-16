class Parent
{
	Parent()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("child class");
	}
}
class InheritanceConstructor
{
	public static void main(String args[])
	{
	Child c=new Child();
	}
}

