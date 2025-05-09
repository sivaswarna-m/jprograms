class Triangle_r4
{
	public static void main(String args[])
	{
			int rows=5,t=1;
			for(int r=1;r<=rows;r++)
			{
				int a=5;
				for(int c=1;c<=r;c++)
				{
					if(r%2!=0)
					{
						System.out.print(t+" ");
						t++;
					}
					else
					{
						System.out.print(a+" ");
						a--;
					}
					
				}				
							
				System.out.println();
			}
	}
}