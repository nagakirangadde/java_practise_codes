import java.util.*;
class Discount
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a day: ");
	String s=sc.nextLine();
	String st=s.toLowerCase();
	if(st.equals("mon") ||st.equals("tue") ||st.equals("wed"))
	{
		System.out.println("The discount...5%");
	}
	else if(st.equals("thr") ||st.equals("fri") )
	{
		System.out.println("The discount...4%");
	}
	else if(st.equals("sat") ||st.equals("sun") )
	{
		System.out.println("The discount...3%");
	}
	else
	{
		System.out.println("Please enter the first three letters of the day");
	}

}
}