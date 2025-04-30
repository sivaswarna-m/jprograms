import java.util.LinkedHashSet;
class Collect_linkedhashset
{
	public static void main(String args[])
	{
	LinkedHashSet a=new LinkedHashSet();
	//LinkedHashSet b=new LinkedHashSet();
	//b.add(20);
	//b.add("hi");
	a.add(20);
	a.add(10);
	a.add(30);
	a.add(30);
	a.add(23.4);
	a.add('x');
	a.add("hello");
	a.add(false);
	a.add(null);
	a.add(0);
	
		System.out.println(a);
	}
}
