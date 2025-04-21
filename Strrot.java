import java.util.Scanner;
import java.util.Arrays;
class Strrot
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		String s1="cdab";
		char a[]=s.toCharArray();
		//char b=a[0];
		int r=2,x=0;
		for(int y=1;y<=r;y++)
		{
			 char  b=a[a.length-1];

		for( x=a.length-1;x>0;x--)
		{			a[x]=a[x-1];
			System.out.println(a[x]);//b c d a
		}
		a[x]=b; 	
		}
		
		String s4="";
		for(char t:a)
		{
			s4+=t;
		}
		System.out.println(s4);
		if(s1.equals(s4))
		{
			System.out.println("rotation");
		}
		else
		{
			System.out.println("not a rotation");
		}
	}
}