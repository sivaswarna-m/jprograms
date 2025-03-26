class Arrmaxmin
{
	public static void main(String[] args)
	{
		int a[]={10,20,30,40,50};
		int max=0;
		for(int x=0;x<a.length;x++)
		{
			if(max<a[x])
				max=a[x];
		}
			System.out.println("max element "+max);
		int min=max;
		for(int x=0;x<a.length;x++)
		{

			if(min>a[x])
				min=a[x];
		}
			System.out.println("min element "+min);

	}
}