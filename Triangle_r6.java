class Triangle_r6
{
	public static void main(String args[])
	{
			int rows=5,t=0;
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=r;c++)
				{
					if(r==c)
					{
						System.out.print(t+" ");
						
					}
					else
					{
						System.out.print(r+" ");
						
					}
					
				}				
							
				System.out.println();
			}
	}
}