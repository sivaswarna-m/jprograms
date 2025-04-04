import java.util.Scanner;
class Arrsum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		double sum=0;
		System.out.println("enter array elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
			sum+=a[x];
		}
			double avg=sum/a.length;
			int avg=(int)avg;
	
		System.out.println("array elements are");

		for(int x=0;x<a.length;x++)
			System.out.println("a["+x+"]="+a[x]);
			System.out.println("sum of array elements="+sum);
			System.out.println("avg of array elements="+avg);
			int c=0;
			for(int x=1;x<=sum;x++)
			{
			if(sum%2==0)
				c++;
			}
				if(c==2)
				System.out.println("prime");
			
			else
			System.out.println(" not prime");

	}
}
			