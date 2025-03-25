public class Constru 
{
	public static void main(String[] args)
	{
		Main m=new Main();
		m.p();
	}
}
class Main
{
	String a,b;
	Main()
	{
		a="I am";
		b="Constructor";
	}
	void p()
	{
		System.out.println(a+" "+b);
	}
}
