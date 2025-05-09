class Triangle_r10
{
	public static void main(String args[])
	{
			int rows=10;
			for(int r=1;r<=rows;r++)
			{
				for(int c=1;c<=r;c++)
				{
					int t=c,n=2;
				 if(c==1)
					{
							System.out.print(c+" ");
					}
					else if(r==c&&r!=rows)
					{
							System.out.print(n+" ");
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