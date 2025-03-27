class Rev
{
	public static void main(String[] args)
	{
		Rev r=new Rev();
		int res[]=r.reverse(new int[]{1,2,3});
		for(int x=0;x<res.length;x++)
		{
		System.out.println("b["+x+"]="+res[x]);
		}
	}
	int[] reverse(int a[])
	{
		int b[]=new int[a.length];
		for(int x=a.length-1,y=0;x>=0;x--,y++)
		{
			b[y]=a[x];
		}
		return b;
	}
}