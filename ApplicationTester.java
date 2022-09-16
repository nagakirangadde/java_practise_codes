public class ApplicationTester 
{ 
 public static void main(String[] args)
 { 
 int[] array = {11,22,33,44,55,11}; 
 int searchNumber = 11, position=999;
 for(int index=0; index < array.length; index++)
 { 
 if(searchNumber == array[index])
 { 
 position = index; 
 } 
 } System.out.println(position); 
 }
}