import java.util.Scanner;
class Strimmutable
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.nextLine();
		s.concat("hi");
		System.out.println(s);//value will not updated until you reassign
	}
}
		