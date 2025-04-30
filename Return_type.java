class Return_type
{
	public static void main(String args[])
	{
		Return_type r=new Return_type();
		I i=r.m1();//return type is interface I so value must be stored in I

		i.m();
	}
	public I m1()//return type interface I
	{
		return new A();//must return its implemented class
	}

}
interface I
{
	public void m();
}
class A implements I
{
	public void m()
	{
		System.out.println("i am in a");
	}
}