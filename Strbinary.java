import java.util.Scanner;
import java.util.Arrays;
class Strbinary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		Arrays.sort(c);
		/*int f=0;
		int l=c.length-1;
		int m=0;*/
		System.out.println("enter search character");
		char search=sc.next().charAt(0);
		Strbinary bi=new Strbinary();
		bi.binarystr(c,search);
	}
	void binarystr(char c[],char search)
	{
		int f=0;
		int l=c.length-1;
		int m=0;

		while(l>=f)
		{
			 m=l+f/2;
			if(search==c[m])
			{
				System.out.println(" character found");
				break;
			}
			else if(search>c[m])
			{
				f=m+1;
			}
			else if(search<c[m])
			{
				l=m-1;
			}
		}
		if(l<f)
			System.out.println("character not found");
	}
}
			