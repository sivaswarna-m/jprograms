class Sorting1
{
	public static void main(String[] args)
	{
	int a[]={10,20,5,40,35,60,80};
	int max=0,b=a[0];
		for(int x=0,y=0,z=a.length-1;x<a.length;x++)
		{
			if(max<a[x])
				{
				max=a[x];
				}
				a[y]=max;

		}
		for(int x=a.length-1;x==a.length-1;x++)
		{
			a[x]=b;
		}
		int min=max;
		int c=0;int t=0;
		for(int y=0, x=a.length-1;y<a.length;y++)
		{		//60 40 35 20 10
			if(min>a[y])//60f 40t 35t 20
				{
				min=a[y];
				t++;//40 35
				}
				a[x]=min;
		}
		for(int x=t;x==t;x++)
		{
			a[x]=b;
		}
		for(int x=0;x<a.length;x++)
		{
		
		System.out.println("a["+x+"]="+a[x]);
		}

	
	}
}