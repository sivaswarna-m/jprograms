class Abstract1
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.add();
		c.sub();
		c.mul();
				
	}
}
 abstract class Parent
{
	 int a,b;
	Parent()
	{
		a=10;
		b=20;	
	}
	public abstract void add(); 
	public void sub()
	{
		System.out.println("a-b="+(a-b));	
	}
	public void mul()
	{
		System.out.println("a*b="+(a*b));
	}
}
class Child extends Parent
{
	int x,y;
	Child()
	{
		x=8;
		y=2;
	}
	@Override
	public void add()
	{
		System.out.println("x+y="+(x+y));
	}
	public void div()
	{
		System.out.println("x/y="+(x/y));
	}
	public void mod()
	{
		System.out.println("x%y="+(x%y));
	}


}