import java.util.Scanner;
class Strcount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");		
		String s=sc.nextLine();
		int cp=0,sm=0,v=0,c=0,d=0,sp=0,sb=0;
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch>='A'&& ch<='Z')
			{
				cp++;
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					v++;
				}
				else
					c++;
			}
			else if(ch>='a'&&ch<='z')
			{
				sm++;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					v++;
				}
				else
					c++;
			}
			else if(ch>='0'&&ch<='9')
			{
				d++;
			}
			else if(ch==' ')
			{
				sp++;
			}
			else
			{
				sb++;
				//System.out.println(ch);
			}
		}
			System.out.println("no of capitals are "+cp);			
			System.out.println("no of small are "+sm);
			System.out.println("no of vowels are "+v);
			System.out.println("no of consonants are "+c);
			System.out.println("no of digits are "+d);
			System.out.println("no of spaces are "+sp);
			System.out.println("no of symbols are "+sb);




	}
}