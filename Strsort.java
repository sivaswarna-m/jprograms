import java.util.Scanner;
import java.util.Arrays;
class Strsort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
				char ch=s.charAt(x+1);

			if(c<ch)
			{
				char t=c;
				c=ch;
				ch=t;
				x=-1;
			}
			System.out.println(c);
		}
		/*char c[]=s.toCharArray();
		Arrays.sort(c);
		for(char t:c)
		System.out.println(t);
		System.out.println();
		for(int x=0;x<c.length-1;x++)
		{
			if(c[x]<c[x+1])
			{
				char t=c[x];
				c[x]=c[x+1];
				c[x+1]=t;
				x=-1;
			}
		}
		for(char t:c)
		System.out.println(t);*/
	}

}