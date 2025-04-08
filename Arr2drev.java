import java.util.Random;
class Arr2drev
{
	public static void main(String args[])
	{
		Random rm=new Random();
		Arr2drev m=new Arr2drev();
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
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
		m.prime(a,0);
	}
	void prime(int a[][],int ct)
	{
		System.out.println("array elements are ");
		for(int r=0;r<a.length;r++)
		{
			for(int c=a[r].length-1;c>=0;c--)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}
}