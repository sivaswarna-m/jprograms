import java.util.Scanner;
class Strwordpalin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		String s2="";
		for(String t:str)
		{
			StringBuffer sb=new StringBuffer(t);
			String rev=sb.reverse().toString();
			if(t.equals(rev))
			{
			System.out.println(t);
			}

		}
	}
}
		