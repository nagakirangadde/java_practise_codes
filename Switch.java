import java.util.*;
class Switch
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
String c;
System.out.print("Enter a character: ");
c=(x.nextLine()).toLowerCase();
//ch=c.toLowerCase();
switch(c)
{
case ("v") : System.out.println("Violet");
					break;
case ("i") : System.out.println("Indigo");
					break;
case ("b") : System.out.println("Blue");
					break;
case ("g") : System.out.println("Green");
					break;
case ("y") : System.out.println("Yellow");
					break;
case ("o") : System.out.println("Orange");
					break;
case ("r") : System.out.println("Red");
					break;
default: System.out.println("character doesn't match");
}


}
}
