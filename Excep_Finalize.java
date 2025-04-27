class Excep_Finalize//garbage collection
{
	@Override
	public void finalize()//default method present in Object class 
	{
		System.out.println(" in finally block");
	}


	public static void main(String args[])
	{
		Excep_Finalize ef=new Excep_Finalize();
		ef=null;
		System.gc();
		System.out.println("program end");
	}
}