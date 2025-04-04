class Mrpoly//overriding
{
	public static void main(String args[])
	{
		Parent parent;//reference type
		parent=new Child();//object type diff
		parent.m();
	}
}
class Parent
{

	void m()
	{
		System.out.println("parent");
	}

}
class Child extends Parent
{
	protected void m()
	{
		System.out.println("child");
	}
}