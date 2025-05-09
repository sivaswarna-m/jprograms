import java.util.ArrayDeque;
class Collect_arraydeque
{
	public static void main(String args[])
	{
	ArrayDeque a=new ArrayDeque();
	ArrayDeque b=new ArrayDeque();
	b.add(20);
	b.add("hi");
	a.add("hi");
	a.add(20);
	a.add(10);
	a.add(30);
	a.add(30);
	a.add(23.4);
	a.add('x');
	a.add("hello");
	a.add(false);
	a.add(0);
	//a.clear();
			
			System.out.println(a.isEmpty());
	a.remove(10);
	a.removeAll(b);	
	a.addAll(b);
			
			System.out.println(a.contains(20));
	//a.add(1,45);//not there
			
		System.out.println(a);
	}
}
