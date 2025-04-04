class Selectionsort
{
	public static void main(String[] args)
	{
		Selectionsort s=new Selectionsort();
		int a[]={2,5,3,10,6,33,77,22,56,43,78};
		int res[]=s.sort(a);
		for(int t:res)
		System.out.println(t);
	}
	int[] sort(int a[])
	{
		for(int x=0;x<a.length;x++)
		{
			int min=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[y]<a[min])
				{
					min=y;
				}
			}
			int t=a[x];
			a[x]=a[min];
			a[min]=t;
		}
		return a;
	}
}