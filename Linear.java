class Linear
{
	public static void main(String[] args)
	{
		Linear l=new Linear();
		l.search();
	}
	void search()
	{
		int a[]=new int[]{1,2,3};
		int search=2,c=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==search)
				{
				System.out.println("element found at "+x);
				c++;
				break;
				}


		}
		if(c==0)
			System.out.println("element not found");
	}
}
