import java.util.Scanner;
class Strconcat
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter s1");
		String s1=sc.nextLine();
		System.out.println("enter s2");

		String s2=sc.nextLine();
		String c="";
		c=s1+s2;
		System.out.println(c);
		c=s2+s1;
		System.out.println(c);

		c=s1.concat(s2);
		System.out.println(c);
	}
}
