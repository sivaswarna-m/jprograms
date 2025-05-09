class Patterns19
{
	public static void main(String args[])
	{
			char cu='A';
			
			for(int r=1;r<=4;r++)
			{
				int n=r;
				for(int c=1;c<=5;c++)
				{
					if(r%2==0)
					{
						System.out.print(n+" ");
						n++;
					}
					else
					{
						System.out.print(cu+" ");
						cu++;
					}				
				}
				System.out.println();
			}
	}
}