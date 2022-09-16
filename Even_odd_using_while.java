class Even_odd_using_while
{
public static void main(String args[])
{
int x=1;
System.out.println("EVEN NUMBERS");
while(x<=100)
{
if(x%2==0)
{
System.out.print(x+" ");
}
x++;
}
System.out.println();
System.out.println("ODD NUMBERS");
int y=1;
while(y<=100)
{
if(y%2!=0)
{
System.out.print(y+" ");
}
y++;
}

}
}