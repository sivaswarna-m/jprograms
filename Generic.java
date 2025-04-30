import java.util.ArrayList;
class Generic//correct code works in eclipse
{
	public static void main(String args[])
	{
		Integer i=10;
		Short s=2;
		Long l=4l;
		Float f=3.5f;
		Byte b=5;
		Double d=7.5;
		ArrayList<Number>al=new ArrayList<>();
		al.add(i);
		al.add(s);
		al.add(l);
		al.add(f);
		al.add(b);
		al.add(d);

		System.out.println(al);
	}
}