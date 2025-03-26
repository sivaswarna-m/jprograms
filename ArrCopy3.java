import java.util.Scanner;
class ArrCopy3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50};
		int b[]=new int[]{45,35,64};
		int c[]=new int[a.length+b.length];
		System.out.println(" a array elements are");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);
			c[x]=a[x];

		}
		System.out.println(" b array elements are");

		for(int x=0;x<b.length;x++)
		{
			System.out.println("b["+x+"]="+b[x]);
		}
		for(int x=0;x<b.length;x++)
		{
			c[x+a.length]=b[x];
		}
		System.out.println(" c array elements are");

		for(int x=0;x<c.length;x++)
		{
			System.out.println("c["+x+"]="+c[x]);
		}


	}
}
