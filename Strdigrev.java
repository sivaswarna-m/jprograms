import java.util.Scanner;
class Strdigrev
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");		
		String s=sc.nextLine();
		String digit="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch>='0'&&ch<='9')
				digit=digit+ch;
		}
		int n=Integer.parseInt(digit);
		int t=n,rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println((t==rev)?"palindrome":"not a palindrome");
	}
}			