class Triangle_r
{
	public static void main(String args[])
	{
			int rows=4;
			for(int r=1;r<=rows;r++)
			{
				int t=r;
				for(int c=1;c<=r;c++)
				{
					System.out.print(t+" ");
					t--;
					
				}
				System.out.println();
			}
	}
}