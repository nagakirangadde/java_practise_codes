import java.util.*;
class Tables
{
public static void main(String args[])
{
Scanner x=new Scanner(System.in);
int num=1,table;
System.out.print("enter a number: ");
table=x.nextInt();
while(num<=10)
{
System.out.println(table+" * "+num+" = "+ table*num);
num++;
}
}
}