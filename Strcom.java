import java.util.Scanner;
class Strcom
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter s1");
		String s1=sc.nextLine();
		System.out.println("enter s2");

		String s2=sc.nextLine();
		if(s1.length()!=s2.length())
			System.out.println("not a anagram");
		else
		{
			int c=0;
			char a[]=s1.toCharArray();
			char b[]=s2.toCharArray();
			for(int x=0;x<a.length;x++)
			{
				for(int y=0;y<b.length;y++)
				{
					if(a[x]==b[y])
						c++;
				}
			}
			if(c==a.length)
			{
				System.out.println("anagram");
			}
			else
				System.out.println("not a anagram");
		}

	}
}