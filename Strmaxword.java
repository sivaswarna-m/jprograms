import java.util.Scanner;
class Strmaxword
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		String s2="";
		int max=0;
		for(String t:str)
		{
			int  l=t.length();
			if(l>=max)
			{
				if(l>max)
				{
		   		max=l;
				s2=t;
				}
				else
				{
				s2=s2+" "+t;
				}
			}
		}
		System.out.println(s2);
	}
}