class Secmin
{
	public static void main(String[] args)
	{
		Secmin s=new Secmin();
		int max=s.m(new int[]{1,2,3,4,5},0);
		int r=s.smin(new int[]{1,2,3,4,5},max,0,0);
		System.out.println(r);
	}
	int smin(int a[],int min,int secmin,int max)
	{
	
		for(int x=0;x<a.length;x++)
		{
				if(min>a[x])
				secmin=min;//5
				else if(a[x]<secmin&& a[x]!=min)
				secmin=a[x];
				if(min>a[x])
				min=a[x];//10 
		}
		return secmin;
	}
	int m(int a[],int max)
	{
		for(int x=0;x<a.length;x++)
		{
			if(max<a[x])
				max=a[x];
		}
		return max;
	}
}