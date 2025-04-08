import java.util.Random;
class Arr2ds
{
	public static void main(String args[])
	{
		Random rm=new Random();
		Arr2ds m=new Arr2ds();
		int b[][]={{1,3,5},{2,3,7},{7,6,2}};
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int d[][]=new int[a.length][a[0].length];
		/*int a[][]=new int[rm.nextInt(1,10)][];	
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
		}*/
		m.prime(a,b,d);
	}
	void prime(int a[][],int b[][],int d[][])
	{
		
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				int sum=0;
				sum=a[r][c]+b[r][c];
				d[r][c]=sum;
				//System.out.print(sum+" ");
				System.out.print(d[r][c]+" ");		
			}
			System.out.println();
		}
	}
}