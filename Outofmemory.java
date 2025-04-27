class Outofmemory
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[Integer.MAX_VALUE];
		}catch(OutOfMemoryError om)
		{
			System.out.println("in catch");
		}
		
	}
}