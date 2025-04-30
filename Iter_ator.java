import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
class Iter_ator
{
	public static void main(String args[])
	{
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(10,34,2,67,5));
		Iterator<Integer> i=a.iterator();
		while(i.hasNext())
		{
		//System.out.println(i.hasNext());
		System.out.println(i.next());
		}
		List<Integer> b=new ArrayList<>(Arrays.asList(10,34,2,67,5));
		ListIterator<Integer> l=b.listIterator();
		while(l.hasNext())
		{
		//System.out.println(l.hasNext());
		System.out.println(l.next());
		}
		while(l.hasPrevious())
		{
		System.out.println(l.hasPrevious());//checks whether it has previous value or not
		System.out.println(l.previous());//gives the previous value

		}

	}
}