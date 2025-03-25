public class even1
{
	int n;
	public void evenodd()
	{
	if(n%2==0)
	{
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
	}
}
class Sample1
{
	public static void main(String[] args)
	{
	even1 a=new even1();
	{
	a.evenodd();
	a.n=10;
	}
	}
}