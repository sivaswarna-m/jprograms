import java.util.Scanner;
import java.util.Arrays;
class Strsort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		char c[]=s.toCharArray();
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
		System.out.println(t);
	}

}