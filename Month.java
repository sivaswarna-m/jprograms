class Month
{
     public static void main(String args[])
     {
       int n=2;
      if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)
      {
          System.out.println("31 days");
      }
      else if(n==4 || n==6 || n==9 || n==11)
      {
          System.out.println("30 days");
      }
      else if(n==2)
      {
          System.out.println("28 or 29 days");
      }
      else
      {
          System.out.println("Invalid input");
      }
          System.out.println((n==1||n==3||n==5||n==7||n==8||n==10||n==12) ? "31 days":(n==4||n==6||n==9||n==11) ? "30 days":(n==2)?"28 or 29 days":"invalid");
    }
}