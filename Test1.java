import java.util.*;
class Test1
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int ca,tc;
        float attendance;
        System.out.print("Total Classes: ");
        tc=x.nextInt();
        System.out.print("Classes attended: ");
        ca=x.nextInt();
        attendance=(((float)ca/tc))*100;
        System.out.println("Your attendance Percentage: "+ attendance);


        if(attendance>0 && attendance<100)
        {
            if(attendance>=75)
                System.out.println("Eligible for exam");
            else if(attendance>=65 && attendance<75)
                System.out.println("Pay condonation fee");
            else
                System.out.println("Detained");
        }
        else
            System.out.println("Enter a valid attendance percentage");

    }
}