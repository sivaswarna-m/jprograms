import java.util.Scanner;
class Strsplitf
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
			char ch=t.charAt(0);
			//System.out.println(ch);
			s2=s2+ch;
		}
		System.out.println(s2);
	}
}