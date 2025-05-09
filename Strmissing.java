import java.util.Scanner;
class Strmissing
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
			
			for(char y='a';y<='z';y++)
			{
				int count=0;

			    for(int x=0;x<s.length();x++)
			    {
				char ch=s.charAt(x);

				//System.out.println(y);
				if(ch==y)
				{
				   count++;
				}
			    }
			    if(count==0)
				System.out.println(y);

			}
	}
}