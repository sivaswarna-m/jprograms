import java.util.Scanner;
class ArrIec
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		int b[]=new int[a.length];
		System.out.println("enter array elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
		}
		int y=0;
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
				{
				b[y]=a[x];
				y++;
				}
		}
		System.out.println("a array elements");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);
		}
		System.out.println("b array elements");
		
		for(int x=0;x<y;x++)
		{
			System.out.println("b["+x+"]="+b[x]);
		}
	}
}