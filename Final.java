class Final
{
	public static void main(String args[])
	{
		int a[]={1,3,3};
		try
		{
			System.out.println(a[4]);
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("catch ");
		}
		finally
		{
			System.out.println("final block");
			System.out.println(a[1]);
			
		}
	}
}