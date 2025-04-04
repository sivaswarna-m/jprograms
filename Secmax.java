class Secmax
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Secmax s=new Secmax();
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;

		int res=s.second(new int[]{1,2,3,4,5,8},max,secmax);
		System.out.println(res);
	}
	int second(int a[],int max,int secmax)
	{
		for(int x=0;x<a.length;x++)
		{
			
			if(max<a[x])
			{
				secmax=max;
				max=a[x];//1 2 3 4 5
			}
			else if(max>a[x] && secmax<a[x])
				secmax=a[x]; 
		}
		return secmax;
	}
}