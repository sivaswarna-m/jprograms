class Du_arr
{
	public static void main(String[] args)
	{
		Du_arr d=new Du_arr();
		int a[]={1,3,2,4,4,5,2,3,77,9,9,7,5,1,1,2};
		d.dupli(a);
	}
	void dupli(int a[])
	{
		int b[]=new int[a.length];

		for(int x=0;x<a.length-1;x++)
		{
			if(b[x]==1)
			continue;
			int c=1;
			for(int y=1;y<a.length-1-x;y++)
			{	
				if(a[y]==a[y+1])
				{
					c++;
					b[y]=1;
				}
			}
			/*if(c==1)
				System.out.println(a[x]);
			if(c>1)
				System.out.println(a[x]);
				System.out.println(a[x]+"="+c);*/
			System.out.println(a[x]);
		}
	}
}
			
					