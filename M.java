class M
{
	public static void main(String[] args)
	{
		M m=new M();
		System.out.println(m.sum(new int[]{1,2,3},0));
	}
	int sum(int a[],int total)
	{
		for(int x=0;x<a.length;x++)
			total+=a[x];
		return total;
	}
}