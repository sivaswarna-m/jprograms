public class even 
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
	even a=new even();
	{
	a.evenodd();
	a.n=10;
	}
}