class Abstract2
{
	public static void main(String []args)
	{
		Parent c=new Child();
		c.m1(1);
		//c.m2();
	}
}
abstract class Parent
{
	public void m1()
	{
		System.out.println("i am parent");
	}
	public void m1(int a)
	{
		System.out.println("i am parent m1");
	}
}
class Child extends Parent
{
	
	public void m2()
	{
		System.out.println("m2");
	} 
}