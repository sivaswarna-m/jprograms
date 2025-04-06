class Interface
{
	public static void main(String []args)
	{
		Child p=new Child();
		p.m();
		p.m1();
		p.m2();
		p.m3();
	}
		
}
class Child implements Parent,Parent1
{
	public void m()
	{
		System.out.println("c-m");
	}
	
	public void m1()
	{
		System.out.println("c-m1");
	}
	public void m2()
	{
		System.out.println("c-m2");
	}
	public void m3()
	{
		System.out.println("c-m3");
	}

	
}
interface Parent 
{
	public abstract void m();
	public abstract void m1();//do not write any methods other than public 
	//void m2();
	//{
	//}
	
}
interface Parent1 
{
	public abstract void m2();
	public abstract void m3();//do not write any methods other than public 
	//void m2();
	//{
	//}
	
}