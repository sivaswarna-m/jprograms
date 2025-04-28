import java.util.PriorityQueue;
class Collect_priorityqueue
{
	public static void main(String args[])
	{
	PriorityQueue a=new PriorityQueue();
	PriorityQueue b=new PriorityQueue();
	b.add("20");
	b.add("hi");
	a.add("2guyfuutg");
	a.add("1ig0");
	a.add("100ghg0");
	a.add("1ygiy");
	//a.add(23.4);
	//a.add('x');
	//a.add("hello");
	//a.add(false);

	//a.remove("1ig0");//value

	//a.addAll(b);//adds the all elements (another list) you want to add

	//a.removeAll(b);//removes all elements you wanted(by using another list) to remove 

	//a.clear();//removes all elements

	System.out.println(a.contains('x'));//gives true is list contains the element else false

	a.add(4,"1");//adds value at given index

	//System.out.println(a.isEmpty());//gives true if list is empty else false

	System.out.println(a.size());
	System.out.println(a);
	}
}