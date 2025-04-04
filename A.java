final class M
{
	public static void main(String[] args)
	{
		A a=new B();
		a.add();
	}
}
class A
{
	final int a=7,b=4;
	
	final void add()
	{
		System.out.println(this.a+this.b);
		
	}
}
class B extends A
{
	final  int a=13,b=4;
	final int c;
	B()
	{
	this.c=1;
	}

	final void add(int x)
	{
		System.out.println("child");
	}
}