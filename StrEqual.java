import java.util.Scanner;
class StrEqual
{
	public static void main(String []args)
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter s1");
		String s1=sc.nextLine();
		System.out.println("enter s2");

		String s2=sc.nextLine();*/
		String s1="hello",s2="hello";

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		System.out.println(s1==s2?"equal":"not equal");
		System.out.println(s1.equals(s2)?"equal":"not equal");
	}
}
