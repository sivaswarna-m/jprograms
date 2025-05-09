class Triangle_r1
{
	public static void main(String args[])
	{
			int rows=3,t=1;
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=r;c++)
				{
					System.out.print(t+" ");
					t++;
					
				}
				System.out.println();
			}
	}
}