class Combi7
{
	public static void main(String args[])
	{
			int rows=5;
			for(int r=1;r<=rows;r++)
			{
				for(int c=rows;c>=r;c--)
				{
		
							System.out.print("-"+" ");							
				}						
				for(int c=1;c<=r;c++)
				{
					if(c==1||c==r||r==rows)
					System.out.print("#"+" ");
					else
					System.out.print(" "+" ");
				}
			
			

			System.out.println();
		}
	}
}