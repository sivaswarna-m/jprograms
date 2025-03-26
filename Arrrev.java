import java.util.Scanner;
class Arrrev
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		int sum=0;
		System.out.println("enter array elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		System.out.println("array elements are");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);

		}
		System.out.println("array elements  in reverse are");

		for(int x=a.length-1;x>=0;x--)
		{
			System.out.println("a["+x+"]="+a[x]);
		}
	}
}
	
	