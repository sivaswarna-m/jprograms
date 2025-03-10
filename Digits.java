class Digits
 {
     public static void main(String args[])
     {
        int n=-11;
	if(n>=0&&n<=9)
	   System.out.println(n);
	else if(n>=10&&n<=99)
	   System.out.println(n%10);
	else if(n>=100&&n<=999)
	   System.out.println(n%100);
	else
	   System.out.println("Invalid");
      }
}

	