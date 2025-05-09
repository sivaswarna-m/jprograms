import java.util.Scanner;
class Strrevstr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String s2="";
		for(int x=0;x<s1.length;x++)
		{	
			//System.out.println(s1[x]);
			String s3=s1[x];
			for(int y=0;y<s3.length();y++)
			{
				char ch=s3.charAt(y);
				if(y!=0&&y!=s3.length()-1)
				{
				s2=Character.toLowerCase(ch);
				s3[x]=s2;
				}
				else
				{
				s2=Character.toUpperCase(ch);
				s3[x]=s2;
				}
		}
		System.out.println(s3);
	}
}	