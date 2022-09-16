import java.util.*;
class Test
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
float attendance;
System.out.println("Enter your attendance");
attendance=x.nextFloat();

if(attendance>0 && attendance<100)
{
	if(attendance>=75)
		System.out.println("Permitted for exam");
	else if(attendance>65 && attendance<75)
		System.out.println("Pay condonation fee");
	else
		System.out.println("Detained");
}
else
	System.out.println("Enter a valid attendance percentage");

}
}