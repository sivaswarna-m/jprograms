import java.util.Scanner;
class ArrCopy
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50};
		int b[]=new int[a.length];
		System.out.println(" a array elements are");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);
			b[x]=a[x];

		}
		System.out.println(" b array elements are");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("b["+x+"]="+b[x]);
		}
	}
}
