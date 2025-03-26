import java.util.Scanner;
class ArrRevcopy
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
		for(int x=0,y=a.length-1;x<a.length;x++,y--)
		{
			b[x]=a[y];
			
		}
		System.out.println(" a array  elements are");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("a["+x+"]="+a[x]);
		}
		System.out.println(" b array  elements are");

		for(int x=0;x<a.length;x++)
		{
			System.out.println("b["+x+"]="+b[x]);
		}
	}
}




		
