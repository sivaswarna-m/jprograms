class Triangle_r7
{
	public static void main(String args[])
	{
			int rows=5,t=0,a=0;
			for(int r=1;r<=rows;r++)
			{
					a=t+r;
						
				for(int c=1;c<=r;c++)
				{
								
					System.out.print(a+" ");
						a--;
						t++;
				
				}				
							
				System.out.println();
			}
	}
}