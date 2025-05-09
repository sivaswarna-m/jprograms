class Excep_order
{
	public static void main(String args[])
	{
		try
		{
			throw new ArithmeticException();
		}catch(ArithmeticException ae)
		{
			System.out.println("catch1");//child must be the first to execute
		}catch(Exception e)
		{
			System.out.println("catch2");
		}
	}
}