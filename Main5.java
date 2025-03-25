import java.util.Scanner;

class Ivan 
{
    int sum = 0;


    Ivan() 
{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	int c=0;
        while (n > 0) 
	{
            sum += n % 10;
            n /= 10;
	    c++;
        }
        while (sum > 9&&c>1) 
	{
            int temp = 0;
            while (sum > 0) 
	    {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
    }
}

public class Main5 
{
    public static void main(String[] args) 
    {
        Ivan ivan = new Ivan();
	int sum=ivan.sum;
	if (sum==1)
         System.out.println("Ivan");
	else
	 System.out.println(" not Ivan");
    }
}