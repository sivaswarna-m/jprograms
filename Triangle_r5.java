class Triangle_r5
{
	public static void main(String args[])
	{
			int rows=5,t=0,a=0;
			for(int r=1;r<=rows;r++)
			{
					a=t+r;
						//System.out.println(a);
				for(int c=1;c<=r;c++)
				{
					
					if(r%2==0||r==1)
					{
						t++;

						System.out.print(t+" ");
					}
					else	
					{					
					System.out.print(a+" ");
						a--;
						t++;
					}
				}				
							
				System.out.println();
			}
	}
}