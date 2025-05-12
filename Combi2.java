class Combi2
{
	public static void main(String args[])
	{
			int rows=5;
			int t=rows;
			for(int r=1;r<=rows;r++)
			{
				for(int c=rows;c>=r;c--)
				{
					if(r==1||c==rows||r==c)
							System.out.print("#"+" ");
					else
							System.out.print(" "+" ");
							
				}						
							
				System.out.println();
			}
			for(int r=2;r<=rows;r++)
			{
				for(int c=1;c<=r;c++)
				{
					if(r==rows||c==1||r==c)
							System.out.print("#"+" ");
					else
							System.out.print(" "+" ");
			}						
							
				System.out.println();
			}

	}
}