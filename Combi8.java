class Combi8
{
	public static void main(String args[])
	{
			int rows=5;
			for(int r=1;r<=rows;r++)
			{					
				for(int c=1;c<=r;c++)
				{
						System.out.print("-"+" ");
				}
				for(int c=rows;c>=r;c--)
				{
						if(c==r||c==rows||r==1)
							System.out.print("#"+" ");
						else
							System.out.print(" ");							
				}				
			

			System.out.println();
		}
	}
}