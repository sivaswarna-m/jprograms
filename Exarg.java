class Exarg
{
	public static void main(String args[])
	{
		Sample s=new Sample();
		try
		{
			s.m1();
		}catch(IllegalArgumentException i)
		{
			System.out.println("catch");
		}
	}
}
class Sample
{
	public void m1()
	{
		Thread t=new Thread();
		t.setPriority(100);
		System.out.println("hi");
	}
}