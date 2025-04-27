import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
class Excep_m
{
	public static void main(String args[]) throws FileNotFoundException
	{
		File f=new File("C:\\Users\\sivas\\OneDrive\\Desktop\\file sample.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}
}