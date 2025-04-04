class Abstract
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.m();
		c.m1();		
	}
}
 abstract class Parent
{
	public abstract static void m(); 
	public void m1()
	{
		System.out.println("parent");
	}
}
class Child extends Parent
{
	@Override
	public void m()
	{
		System.out.println("child");
	}

}