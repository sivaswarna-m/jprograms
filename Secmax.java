class Secmax
{
	public static void main(String[] args)
	{
		Secmax s=new Secmax();
		int res=s.second(new int[]{1,2,3,4,5},0,0);
		System.out.println(res);
	}
	int second(int a[],int max,int secmax)
	{
		for(int x=0;x<a.length;x++)
		{
			secmax=max;//0 10 20 30 40 50
			if(max<a[x])
				max=a[x];//10 20 30 40 50 90
		}
		return secmax;
	}
}