class Triangle_r8
{
	public static void main(String args[])
	{
			int rows=5;char a='A';
			for(int r=1;r<=rows;r++)
			{
				int t=r;
				for(int c=1;c<=r;c++)
				{
								
					System.out.print(t+""+a+" ");
					t++;
										
				}
				a++;				
							
				System.out.println();
			}
	}
}