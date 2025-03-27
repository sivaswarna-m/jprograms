import java.util.Scanner;
class Arrarmavg
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[sc.nextInt()];
		double sum=0;
		System.out.println("enter array elements");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
			sum+=a[x];
		}
			double average=sum/a.length;
			System.out.println(average);
			int avg=(int)average;
			System.out.println(avg);
			int temp=avg;
		int c=0;
		while(avg>0)
		{
			avg=avg/10;
			c++;
		}
		int arsum=0;
		avg=temp;
		while(avg>0)
		{
			arsum+=Math.pow(avg%10,c);
			avg=avg/10;
		}
		
		if(arsum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("not Armstrong");
	}
}
