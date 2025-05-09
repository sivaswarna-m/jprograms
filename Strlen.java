import java.util.Scanner;
class Strlen
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		int c=0;
		char s1[]=s.toCharArray();
		for(char t:s1)
			c++;
		System.out.println(c);
	}
}