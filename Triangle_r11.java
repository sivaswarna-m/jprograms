class Triangle_r11
{
	public static void main(String args[])
	{
			int rows=5;
			for(int r=1;r<=rows;r++)
			{
				int t=rows;
				for(int c=1;c<=r;c++)
				{
					System.out.print(t+" ");
					t--;
				}								
							
				System.out.println();
			}
	}
}