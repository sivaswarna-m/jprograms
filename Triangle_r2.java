class Triangle_r2
{
	public static void main(String args[])
	{
			int rows=5,a=1;
			for(int r=1;r<=rows;r++)
			{
				int t=a;

				for(int c=1;c<=r;c++)
				{
					System.out.print(t+" ");
					a=t++;
				}
				
							
				System.out.println();
			}
	}
}