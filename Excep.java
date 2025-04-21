class Excep
{
	public static void main(String args[])
	{
		Exc e=new Exc();
		e.m1();
		System.out.println("After exception");

	}
}
class Exc
{
	public void m1()
	{
		m2();
	}
	public void m2()
	{
		System.out.println("before exception");
		System.out.println(10/0);//Exception or run time error occurs here
		System.out.println("exception occured");

	}
}