import java.util.Scanner;
class Strwordrev
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
			sb.reverse();
			s2=s2+sb+" ";
		}
		System.out.println(s2);
	}
}