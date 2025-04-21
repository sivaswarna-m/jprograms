import java.util.Scanner;
class Exill
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		sc.close();
		try
		{
		sc.nextLine();
		}catch(IllegalStateException e)
		{
			System.out.println("inside catch");
		}
	}
}