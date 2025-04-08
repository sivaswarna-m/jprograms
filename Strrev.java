import java.util.Scanner;
class Strrev
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");		
		String s=sc.nextLine();
		String rev="";
		for(int x=s.length()-1;x>=0;x--)
		{
			char ch=s.charAt(x);
			rev=rev+ch;
		}
		System.out.println(rev.equals(s)?"palindrome":"not a palindrome");
		System.out.println(rev.equalsIgnoreCase(s)?"palindrome":"not a palindrome");

	}
}