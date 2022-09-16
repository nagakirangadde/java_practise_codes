class Student
{
String name,college_id;
float percentage;
Student(String n, String id, float per)
{
	name=n;
	college_id=id;
	percentage=per;
}
void talk()
{
System.out.println(" Name: "+name);
System.out.println(" College Id: "+college_id);
System.out.println(" Percentage: "+percentage);
}
}

class ParameterConstructor
{
public static void main(String args[])
{
	Student kiran=new Student("Nagakiran","URK18EC088",83.3f);
	kiran.talk();
	System.out.println("---------------------------------------------------");
	Student karthik=new Student("Naga karthikeya","URK18EC070",93.3f);
	karthik.talk();
}
}
