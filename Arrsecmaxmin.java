class Arrsecmaxmin
{
	public static void main(String[] args)
	{
		int a[]={10,5,20,30,40,50,20,30,90};
		int max=0,secmax=0;
		for(int x=0;x<a.length;x++)
		{
			secmax=max;//0 10 20 30 40 50
			if(max<a[x])
				max=a[x];//10 20 30 40 50 90
		}

		System.out.println("max element in array "+max);
		
		System.out.println("second max element in array "+secmax);
		int min=max,secmin=0;
		for(int x=0;x<a.length;x++)
		{
				if(min>a[x])
				secmin=min;
				else if(a[x]<secmin&& a[x]!=min)
				secmin=a[x];
				if(min>a[x])
				min=a[x];//10 
		}
			System.out.println("min element "+min);
			System.out.println("second min element in array "+secmin);


	}
}
