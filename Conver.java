class Conver
{
	/*public void m(double a)
	{
		System.out.println(a);
	}
	public void m(int a)
	{
		System.out.println(a);
	}
	public void m(long a)
	{
		System.out.println(a);
	}*/
	public void m(int a)
	{
		System.out.println(a);
	}
	public void m1(char a)
	{
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		Conver c=new Conver();
		/*c.m(13);
		c.m((short)25);
		c.m((byte)3);
		c.m('a');*/
		c.m((int)17.01);
		c.m1((char)(97));
	}
	
}