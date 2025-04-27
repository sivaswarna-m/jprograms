class Excep_rethrow//re-throwing an exception 
{
	public static void main(String args[])
	{
		Excep_rethrow e=new Excep_rethrow();
		try
		{
			e.m();
		}catch(ArithmeticException rae)
		{
			System.out.println("re-thrown exception handled");
		}
	}
		
	public void m()
	{
		try
		{
			throw new ArithmeticException();
		}catch(ArithmeticException ae)
		{
			throw ae;//re-throwing exception
		}
	}
}