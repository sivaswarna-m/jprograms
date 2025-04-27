class Excep_return
{
	public static void main(String args[])
	{
		Excep_return e=new Excep_return();
		System.out.println(e.m());
	}
	public String m()
	{
		try
		{
			throw new ArithmeticException();
			//return "try";
		}catch(Exception e)
		{
			return "catch";
		}
		/*finally
		{
			return "finally";
		}*/
	}
}			