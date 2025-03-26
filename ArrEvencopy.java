import java.util.Scanner;
class ArrEvencopy
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		int b[]=new int[a.length];
		System.out.println("enter array elements");
		int y=0;
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
			if(a[x]%2==0)
				{
				b[y]=a[x];
				y++;//1 2 3
				}
		}
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2!=0)
				{
				b[y]=a[x];
				y++;// 4
				}
		}
		System.out.println(" a array elements are");


		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);
		}
		System.out.println(" b array elements are");


		for(int x=0;x<a.length;x++)
		{
			System.out.println("b["+x+"]="+b[x]);
		}
	}
}