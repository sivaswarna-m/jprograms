import java.util.Scanner;
class Strcharindex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");		
		String s=sc.nextLine();
		String e="";
		String o="";
		String s4="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(x%2==0)
			   e=e+c;
			else
			   o=o+c;
		}
		e=e.toLowerCase();
		o=o.toUpperCase();
		String rev="";
		for(int x=e.length()-1;x>=0;x--)
		{
			char ch=e.charAt(x);
			rev=rev+ch;
		}
		s4=rev+o;
		System.out.println(e);
		System.out.println(o);
		System.out.println(s4);

	}
}