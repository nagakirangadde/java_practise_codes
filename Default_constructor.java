class Person
{
String name;
int age;
Person()
{
name="Nagakiran";
age=22;
}
void talk()
{
System.out.println("Hi, this is "+name);
System.out.println("My age is "+age);
}
}
class Default_constructor 
{
public static void main(String args[])
{
Person p = new Person();
p.talk();
}
}