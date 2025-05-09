import java.util.Scanner;
import java.util.Random;
class Arr2d_sum
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		Random rm=new Random();
		int sum=0;
		//System.out.println("enter row size");
		int a[][]=new int[rm.nextInt(1,10)][];
				 for(int r=0;r<a.length;r++)
		  {				
				//System.out.println(r+"column size");
				a[r]=new int[rm.nextInt(1,10)];
			
		  }
			//System.out.println("enter array elements");

		  for(int r=0;r<a.length;r++)
		  {
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=rm.nextInt(1,10);
				
			}
		  }
			System.out.println("Array elements are");
		for(int r=0;r<a.length;r++)
		  {
			int row_sum=0;
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
				sum+=a[r][c];
				row_sum+=a[r][c];
				
			}
			System.out.print("sum is "+row_sum);
			System.out.println();

		  }
		System.out.println("sum is "+sum);

	}
}

		