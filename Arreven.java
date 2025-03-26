import java.util.Scanner;
class Arreven
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
		System.out.println("array even elements are");
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
				System.out.println("a["+x+"]="+a[x]);
		}
		System.out.println("array even index elements are");

		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
				System.out.println("a["+x+"]="+a[x]);
		}

	}
}

