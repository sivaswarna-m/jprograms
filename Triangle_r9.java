class Triangle_r9
{
	public static void main(String args[])
	{
			int rows=10;
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=r;c++)
				{
					int t=c;
					if(r==c)
					{
							System.out.print(r+" ");
					}
					else if(c==1)
						{
							System.out.print(c+" ");
					}
					else if(r==rows)
					{
							System.out.print(t+" ");
							t++;
					}
					else
					{
							System.out.print(" "+" ");
					}

										
				}
								
							
				System.out.println();
			}
	}
}