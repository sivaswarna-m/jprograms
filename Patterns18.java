class Patterns18
{
	public static void main(String args[])
	{
			char cu='A';
			
			for(int r=1;r<=4;r++)
			{
				int n=r+1;
				for(int c=1;c<=5;c++)
				{
					if(r==1||r==4)
					{
					System.out.print(cu+" ");
					cu++;
					}
					else if(c==1||c==5)
					{
						System.out.print("#"+" ");
					}
					else
					{
						System.out.print(n+" ");
						n++;
					}
						
				}
				System.out.println();
			}
	}
}