class Revtri4
{
	public static void main(String args[])
	{
			int rows=5;
			for(int r=1;r<=rows;r++)
			{
				int t=1;
				for(int c=rows;c>=r;c--)
				{
							System.out.print(t+" ");
							t++;
				}
											
							
				System.out.println();
			}
	}
}