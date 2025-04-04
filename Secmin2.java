class Secmin2
{
	public static void main(String[] args)
	{
		Secmin2 s=new Secmin2();
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;

		int res=s.second(new int[]{9,80,6,90,79,39,2},min,secmin);
		System.out.println(res);
	}
	int second(int a[],int min,int secmin)
	{
		for(int x=0;x<a.length;x++)
		{
			
			if(min>a[x])
			{
				secmin=min;
				min=a[x];//1 2 3 4 5
			}
			else if(min<a[x] && secmin>a[x])
				secmin=a[x]; 
		}
		return secmin;
	}
}