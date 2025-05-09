import java.util.Random;
class Arr2dp
{
	public static void main(String args[])
	{
		Random rm=new Random();
		Arr2dp m=new Arr2dp();
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
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}

		for(int r=0;r<a.length;r++)
		{

			for(int c=0;c<a[r].length;c++)
			{	ct=0;
				System.out.print(a[r][c]+" ");
				for(int x=1;x<=a[r][c];x++)
				{
					

				if(a[r][c]%x==0)
				{
					ct++;
				}
				}
				

			}
			if(ct==2)
					System.out.print("is prime"+t);
			System.out.println();


		}
	}
}