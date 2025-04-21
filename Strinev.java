import java.util.Scanner;
class Strinev
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(x%2==0)
			{
				ch=Character.toUpperCase(ch);
			}
		
			s1=s1+ch;
		}
		System.out.println(s1);
	}
}