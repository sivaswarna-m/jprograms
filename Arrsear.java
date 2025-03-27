import java.util.Scanner;
class Arrsear//Linear search
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]={10,20,30,40,50};
		int b=30,c=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==b)
				System.out.println("element found at index"+x);
				c++;
				break;
		}
		if(c==0)
			System.out.println("element not found");

	}
}
		