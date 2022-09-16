import java.util.*;
class Marks
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int Phy, Che, Bio, Maths, Cs;
float percentage;
System.out.print("Enter physics marks: ");
Phy=x.nextInt();
System.out.print("Enter chemistry marks: ");
Che=x.nextInt();
System.out.print("Enter biology marks: ");
Bio=x.nextInt();
System.out.print("Enter Maths marks: ");
Maths=x.nextInt();
System.out.print("Enter Computer science marks: ");
Cs=x.nextInt();

percentage=(float)((Phy+Che+Bio+Maths+Cs)/500)*100;



if(percentage>=0 && percentage<=100)
{
	if(percentage>=90)
		System.out.println("GRADE A");
	else if(percentage>=80)
		System.out.println("GRADE B");
	else if(percentage>=70)
		System.out.println("GRADE C");
	else if(percentage>=60)
		System.out.println("GRADE D");
	else if(percentage>=40)
		System.out.println("GRADE E");
	else
		System.out.println("GRADE F");
}
else
	System.out.println("Enter valid Marks ");

}
}