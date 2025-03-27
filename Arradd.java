class Arradd
{
	public static void main(String[] args)
	{
		int a[]={10,20,30,40,50};
		int b[]=new int[a.length];
		for(int x=0;x<a.length;x++)
		{
			if(x==0)
				b[x]=a[x]+a[x+1];
			else if(x<=a.length-2)
				b[x]=a[x-1]+a[x+1];
			else
				b[x]=a[x-1]+a[x];
			System.out.println("b["+x+"]="+b[x]);

		}
	}
}
