import java.util.Scanner;
class Multi_Excep
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int a[]={1,3,5,6};
		int n=sc.nextInt();
		try
		{
			System.out.println(a.length/n);
			System.out.println(a[n]);
		}catch(ArithmeticException b)

		{
			System.out.println("catch 1");
		}
		catch(ArrayIndexOutOfBoundsException ae)

		{
			
			System.out.println("catch 2");
		}
	}
}