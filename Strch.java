import java.util.Scanner;
class Strchar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");		
		String s=sc.next();
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			System.out.println(ch);
		}
	}
}