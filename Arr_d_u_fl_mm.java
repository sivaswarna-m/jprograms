class Arr_d_u_fl_mm
{
	public static void main(String[] args)
	{
		Arr_d_u_fl_mm d=new Arr_d_u_fl_mm();
		int a[]={1,32,2,2,22,3,4,5,32,5,7,5};
		d.dupli(a);
	}
	void dupli(int a[])
	{
		int t=0,n=0;
		int max=Integer.MIN_VALUE;
		int b[]=new int[a.length];
		for(int x=0;x<a.length-1;x++)
		{
			
			if(b[x]==1)
			{
			continue;
			}
			int c=1;
			for(int y=x+1;y<a.length;y++)
			{	
				if(a[x]==a[y])
				{
					c++;
					b[y]=1;
				}
			}
			if(c==1)
			{
				int d[]=new int[a.length];
			
				for(int z=0;z<d.length-1;z++)
				{
				d[z]=a[x];
					if(max<d[z])
					{
					max=d[z];
					}
			}

				/*t=a[x];
				n++;
				System.out.println("first unique element:"+t);
				break;*/
			}
			/*if(c>1)
			{
				
				int d[]=new int[a.length];
			
				for(int z=0;z<d.length-1;z++)
				{
				d[z]=a[x];
					if(max<d[z])
					{
					max=d[z];
					}
			}
				//t=a[x];
				//n++;
				//System.out.println("first duplicate element:"+t);
				//break;
			}*/

		}
			//System.out.println("last  unique element :"+t);
			//   System.out.println("last  duplicate element :"+t);
				//System.out.println("no of  unique elements :"+n);

				//System.out.println("no of  duplicate elements :"+n);
				//System.out.println("max duplicate element :"+max);
				System.out.println("max unique  element :"+max);


	}
}
