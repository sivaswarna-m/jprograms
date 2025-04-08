import java.util.Arrays;
import java.util.Scanner;
class Struniquedup
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		char d[]=new char[c.length];
		Struniquedup dup=new Struniquedup();
		dup.dupFreq(c,d);
	}
	void dupFreq(char c[],char d[])
	{
		for(int x=0;x<c.length;x++)
		{
			if(d[x]==1)	
			{
				continue;
			}
			int count=1;
			for(int y=x+1;y<c.length;y++)
			{
				if(c[x]==c[y])
				{
					count++;
					d[y]=1;
				}
			}
			if(count==1)
			{
				System.out.println(c[x]);//unique
			}
			/*if(count>1)
				System.out.println(c[x]+" "+count);//dup+freq*/
				//System.out.println(c[x]);//to print all char once
		}
	}
}
		