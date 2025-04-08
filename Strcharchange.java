import java.util.Scanner;
class Strcharchange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");		
		String s=sc.nextLine();
		String b="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c>='A'&&c<='Z')
			{
				c=(char)(c+32);
			}
			else if(c>='a'&&c<='z')
			{
				c=(char)(c-32);
			}
			else
				c=c;
			b=b+c;
		}
		System.out.println(b);
	}
}