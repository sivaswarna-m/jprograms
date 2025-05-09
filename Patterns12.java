class Patterns12
{
	public static void main(String args[])
	{
				
			int t=1;
			for(int r=1;r<=5;r++)
			{ 
				for(int c=1;c<=5;c++)
				{
				if(r==c||r+c==6)
				{
					System.out.print(t+" ");
					t++;
				}
				else
					System.out.print(" "+" ");
				}
				System.out.println();
			}
	}
}