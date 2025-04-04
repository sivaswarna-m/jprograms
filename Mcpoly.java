class Mcpoly//overloading
{
	public static void main(String args[])
	{
		Mcpoly mp;//reference type
		mp=new Mcpoly();//object type both are same in compile time polymorphism
		System.out.println(mp.m1('s'));
	}
	public void m1()
	{
		System.out.println("void method");
	}
	public int m1(int a)
	{
		return a;
	}
	public char m1(char a)
	{
		return a;
	}
        public String m1(String a)
	{
		return a;
	}
	public double m1(double a)
	{
		return a;
	}
}