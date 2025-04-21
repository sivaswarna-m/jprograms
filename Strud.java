import java.util.Scanner;
class Strud
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			/*if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				System.out.println(ch);
			}*/
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				if(s2.indexOf(ch)==-1)
				{
					s2=s2+ch;
				}
			}
						
		}
		System.out.println(s2);

	}
}