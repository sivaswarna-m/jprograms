class Combi4
{
	public static void main(String args[])
	{
			int rows=5;
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=r;c++)
				{
					
							System.out.print("#"+" ");
				}						
							
				System.out.println();
			}
			for(int r=2;r<=rows;r++)
			{
				for(int c=rows;c>=r;c--)
				{
		
							System.out.print("#"+" ");							
				}						
							
				System.out.println();
			}


	}
}