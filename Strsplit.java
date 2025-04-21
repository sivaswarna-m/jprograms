import java.util.Scanner;
class Strsplit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		String str[]=s.split(" ");
		for(String t:str)
		{
			System.out.println(t);
			//String s2=t+"";
			//System.out.print(s2+" ");
		}
		
	}
}