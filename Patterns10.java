class Patterns10
{
	public static void main(String args[])
	{
				

			for(int r=1;r<=5;r++)
			{ 
				for(int c=1;c<=5;c++)
				{
				if(r==c||r+c==6)
					System.out.print(r+" ");
				else
					System.out.print(" "+" ");
				}
				System.out.println();
			}
	}
}