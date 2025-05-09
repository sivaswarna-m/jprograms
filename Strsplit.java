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
			
		}
		
	}
}