import java.util.Scanner;
class Arrpersqrt
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		System.out.println("enter array elements");
		int y=0,z=0;
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
			double sq=Math.sqrt(a[x]);
			if(a[x]%sq==0)
				{
				b[y]=a[x];
				y++;//1 2 3
				}
			else
				{
				c[z]=a[x];
				z++;
				}
		}
		System.out.println(" a array elements are");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);
		}
		System.out.println(" b array elements are");

		for(int x=0;x<y;x++)
		{
			System.out.println("b["+x+"]="+b[x]);
		}
		System.out.println(" c array elements are");

		for(int x=0;x<z;x++)
		{
			System.out.println("c["+x+"]="+c[x]);
		}
	}
}