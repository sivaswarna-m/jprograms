import java.util.Scanner;
import java.util.Random;
class Demo1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int arr[]=new int[5];
		/*arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;*/
		System.out.println("length of array is "+arr.length);
		/*for(int x=0;x<arr.length;x++)
		{
			arr[x]=r.nextInt();
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("array elements are"+arr[x]);		
		}*/
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=sc.nextInt();
		}
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("array elements are"+arr[x]);		
		}

		System.out.println(arr.getClass());// [I  [D  [C  [S   for boolean [Z defalt encoding of java datatypes
	}
}

		
		