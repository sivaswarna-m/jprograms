class Poly 
{
	public static void main(String[] args)
	{
		Poly p=new Poly();
		p.m();
	}
	void m()
	{
		System.out.println("first m");	
	}
	int m(int a)
	{
		a=10;
		return a;
	}
	int m(int a,int b)
	{ 
		a=10;
		b=20;
		return a+b;
	}
	
}
class Poly1 extends Poly
{
	void m()
	{
		System.out.println("class 2 m");
	}
}