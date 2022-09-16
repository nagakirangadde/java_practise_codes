import java.util.*;
class Subject
{
	String sub_id;
	String sub_name;
	int passmark;
	int marksobtained;
	Subject(String sub_id,String sub_name,int passmark,int marksobtained)
	{
		this.sub_id=sub_id;
		this.sub_name=sub_name;
		this.passmark=passmark;
		this.marksobtained=marksobtained;
	}

	void method1()
	{
		System.out.println("subject_id: "+sub_id);
		System.out.println("name: "+sub_name);
		System.out.println("pass mark: "+passmark);
		System.out.println("marks obtained: "+marksobtained);
	}
	int method2()
	{
		return marksobtained;
	}

}
class Student
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll number: ");
		String id=sc.nextLine();
		System.out.print("Enter name: ");
		String name=sc.nextLine();
		System.out.print("Enter department: ");
		String dept=sc.nextLine();
		System.out.print("Enter no. of subjects: ");
		int sub=sc.nextInt();

	/*sc.nextLine();
	System.out.print("Enter Subject ID: ");
	String sub_id=sc.nextLine();
	System.out.print("Enter subject name: ");
	String subname=sc.nextLine();
	System.out.print("Enter pass mark: ");
	int passmark=sc.nextInt();
	System.out.print("Enter marks obtained: ");
	int marksobtained=sc.nextInt();
	Subject obj=new Subject(sub_id,subname,passmark,marksobtained);*/
		int arr[]=new int[sub];
		int sum=0;
		double per;
		int total=sub*100;
		for(int i=0;i<sub;i++)
		{
			sc.nextLine();
			System.out.print("Enter Subject ID: ");
			String sub_id=sc.nextLine();
			System.out.print("Enter subject name: ");
			String subname=sc.nextLine();
			System.out.print("Enter pass mark: ");
			int passmark=sc.nextInt();
			System.out.print("Enter marks obtained: ");
			int marksobtained=sc.nextInt();
			Subject obj=new Subject(sub_id,subname,passmark,marksobtained);
			obj.method1();
			arr[i]=obj.method2();
		}
		for(int i=0;i<sub;i++)
		{

			sum+=arr[i];
		}
		per=(double)sum*100/total;
		System.out.println("progress card");
		System.out.println();
		//obj.method1();
		System.out.println("Total marks obtained: "+sum);
		System.out.println("Percentage: "+per);


	}
}
