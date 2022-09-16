class ExceptionHandling
{
	public static void main(String args[])
	{
	try
	{
		int arr[]={10,5,1,2,3};
		int r=arr[0]/arr[1];
		System.out.println(r);
		System.out.println(arr[10]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("division with zero is NA "+e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array out of range "+e);
	}
	}
}
