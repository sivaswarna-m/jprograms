import java.util.Random;
class Arr2d
{
	public static void main(String args[])
	{
		Random rm=new Random();
		Arr2d m=new Arr2d();
		int a[][]=new int[rm.nextInt(1,10)][];	
		for(int r=0;r<a.length;r++)
		{
			a[r]=new int[rm.nextInt(1,10)];
		}
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				a[r][c]=rm.nextInt(1,100);
			}
		}
		
		int max=Integer.MIN_VALUE;
		int res =m.max(a,max);
		System.out.println("max element in array is "+res);
	}
	int max(int a[][],int max)
	{
		System.out.println("array elements are ");
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}

		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{

		           if(a[r][c]>max)
		           {
			     max=a[r][c];
		           }
			}
		}
			return max;
			//System.out.println("max element in the array is "+max);
	}
}
		