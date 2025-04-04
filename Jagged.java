class Jagged
{
	public static void main(String[] args)
	{
		Jagged j=new Jagged();
		int a[][]={{1,2,3},{4,5,6,7},{10,11,12,8,9},{12,1}};
		j.array(a);
		
	}
	void array(int a[][])
	{
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
	}

}