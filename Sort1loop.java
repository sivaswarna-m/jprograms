class Sort1loop
{
	public static void main(String args[])
	{
	int a[]={1,4,-2,6,-9,5,0,-7};
	for(int x=0;x<a.length-1;x++)
	{
		if(a[x]<a[x+1])
		{
			int t=a[x];
			a[x]=a[x+1];
			a[x+1]=t;
			x=-1;
		}
	}
		for(int t:a)
		{
			System.out.print(t+" ");
		}
	}
}