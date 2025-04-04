class Binary_search1//descending
{
	public static void main(String args[])
	{
		Binary_search bi=new Binary_search();
		int a[]={3,5,2,1,4};
		for(int x=0;x<a.length-1;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]<a[y])
				{
					int b=a[x];
					a[x]=a[y];
					a[y]=b;
				}
			}
		}
		for(int t:a)
			System.out.println(t);//5 4 3 2 1 
		bi.binary(a);		     // 0 1 2 3 4
	}
void binary(int a[])
{
	int search=1,f=0,l=a.length-1,m=0;
	while(f<=l)
	{
		m=(f+l)/2;//2//3//4
		if(search==a[m])//1==3//1==2//1==1
			{
			System.out.println("element found");
			break;
			}
		else if(search>a[m])
			{
			l=m-1;
			}
		else if(search<a[m])
			{
			f=m+1;//3//4
			}

	}
		System.out.println(f+" "+l);
	/*if(f>l)
		System.out.println("element not found");*/
	
}
}