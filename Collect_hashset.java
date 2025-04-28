import java.util.HashSet;
class Collect_hashset
{
	public static void main(String args[])
	{
	HashSet a=new HashSet();
	HashSet b=new HashSet();
	b.add(20);
	b.add("hi");
	a.add(20);
	a.add(10);
	a.add(30);
	a.add(23.4);
	a.add('x');
	a.add("hello");
	a.add(false);
	a.add(null);
	a.add(0);
	System.out.println(a);

	//a.remove(10);//value
	
	//a.addAll(b);//adds the all elements (another list) you want to add
	
	//a.removeAll(b);//removes all elements you wanted(by using another list) to remove 
	
	//a.clear();//removes all elements
	
	System.out.println(a.contains(20));//gives true is list contains the element else false
	
	//a.add(6,1);//doesnt work for hashset
	
	System.out.println(a.isEmpty());//gives true if list is empty else false
	
	System.out.println(a.size());
	System.out.println(a);
	}
}