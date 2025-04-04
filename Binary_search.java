class Binary_search//ascending
{
	public static void main(String args[])
	{
		Binary_search bi=new Binary_search();
		int a[]={3,5,2,1,4};
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					int b=a[x];
					a[x]=a[y];
					a[y]=b;
				}
			}
		}
		for(int t:a)
			System.out.println(t);
		bi.binary(a);
	}
void binary(int a[])
{
	int search=1,f=0,l=a.length-1,m=0;
	while(l>=f)
	{
		m=(l+f)/2;
		if(search==a[m])
			{
			System.out.println("element found");
			break;
			}
		else if(search>a[m])
			{
			f=m+1;
			}
		else if(search<a[m])
			{
			l=m-1;
			}

	}
	if(l<f)
		System.out.println("element not found");
	
}
}