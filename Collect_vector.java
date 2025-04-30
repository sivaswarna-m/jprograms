import java.util.Vector;
class Collect_vector
{
	public static void main(String args[])
	{
	Vector a=new Vector();
	//Vector b=new Vector();
	//b.add(20);
	//b.add("hi");
	a.add("hi");
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
