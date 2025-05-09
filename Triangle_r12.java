class Triangle_r12
{
	public static void main(String args[])
	{
			int rows=4;
			
			for(int r=1;r<=rows;r++)
			{
				int	t=2;
				for(int c=1;c<=r;c++)
				{
						if(t%2==0)
						{
							System.out.print(t+" ");
						}
						t+=2;
				}								
							
				System.out.println();
			}
	}
}