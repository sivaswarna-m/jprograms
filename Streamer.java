import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Streamer 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList(Arrays.asList(1,86,4,20,60));
		System.out.println("count is "+(a.stream().count()));
		System.out.println("limit");
		a.stream().limit(3).forEach(x->System.out.println(x));
		System.out.println("skip");
		a.stream().skip(3).forEach(x->System.out.println(x));
		System.out.println("filter+count");
		System.out.println(a.stream().filter(x->x<10).count());
		System.out.println("distinct");
		a.stream().distinct().forEach(x->System.out.println(x));
		System.out.println("map+count");
		System.out.println(a.stream().map(x->x/2).count());
		System.out.println("distinct+collect+toSet");
		System.out.println(a.stream().distinct().collect(Collectors.toSet()));
	}

}
