import java.util.Scanner;
class Strbuffrev
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s1=sc.nextLine();
		StringBuffer sb=new StringBuffer(s1);
		//System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		String rev=sb.toString();
		System.out.println(s1.equals(rev)?"palindrome":"not a palindrome");
		//System.out.println(sb.contentEquals(s1)?"palindrome":"not a palindrome");
	}
}