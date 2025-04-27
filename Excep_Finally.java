class Excep_Finalize
{
	@override
	public void finalize()
	{
		System.out.println(" in finally block");
	}


	public static void main(String args[])
	{
		Excep_Finally ef=new Excep_Finally();
		ef=null;
		System.gc();
		System.out.println("program end");
	}
}