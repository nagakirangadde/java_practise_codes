import  java.util.*;
class ArrayList
{
	public static void main(String args[])
	{
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> al1=new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(1);
	al.add(2);
	al.add(3);
	for(int x:al)
	{
	if(al1.contains(x))
	{
		continue;
	}
	else
	{
		al1.add(x);
	}
	}
	for(int x:al1)
	{
	System.out.print(x);
	}
}
}