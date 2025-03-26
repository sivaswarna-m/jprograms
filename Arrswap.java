import java.util.Scanner;
class Arrswap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30};
		int b[]={5,15,25};
		int c[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			c[x]=a[x];
		}
		for(int x=0;x<a.length;x++)
		{
			a[x]=b[x];
		}
		for(int x=0;x<a.length;x++)
		{
			b[x]=c[x];
		}
		System.out.println("a array elements");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);
		}
		System.out.println("b array elements");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("b["+x+"]="+b[x]);
		}
	}
}

		

