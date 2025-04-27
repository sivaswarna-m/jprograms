class Excep_order
{
	public static void main(String args[])
	{
		try
		{
			throw new ArithmeticException();
		}catch(ArithmeticException ae)
		{
			System.out.println("catch1");
		}catch(Exception e)
		{
			System.out.println("catch2");
		}
	}
}