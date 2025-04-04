class Arr_dup
{
	public static void main(String[] args)
	{
		Arr_dup d=new Arr_dup();
		int a[]={10,20,10,30,40,20,10,50};
		d.dupli(a);
	}
	void dupli(int a[])
	{
		int b[]=new int[a.length];

		for(int x=0;x<a.length;x++)
		{
			if(b[x]==1)
			{
			continue;
			}
			int c=1;
			for(int y=x+1;y<a.length-x;y++)
			{	
				if(a[x]==a[y])
				{
					c++;
					b[y]=1;
				}
			}
			
			/*if(c==1)
				System.out.println("unique elements are:"+a[x]);
			if(c>1)
				{
				System.out.println("duplicate elements are:"+a[x]);
				System.out.println("frequency of dup elem:"+a[x]+"="+c);
				}*/
			System.out.println(a[x]);//printing all elements once
		}
	}
}
			
					