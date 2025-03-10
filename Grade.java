class Grade
{
     public static void main(String args[])
     {
       String name="Radha";
       int s1=100,s2=80,s3=100,s4=90;
       double max=400;
       int total=s1+s2+s3+s4;
       double percentage=total/max*100;
       if(s1<35 || s2<35 || s3<35 || s4<35)
       {
          System.out.println(name+" "+"failed in exam");
       }
       else if(percentage>100)
       {
          System.out.println("invalid grade");
       }
       else if(percentage>=90)
       {
          System.out.println(percentage+" "+"A+ grade");
       }
       else if(percentage>=80)
       {
          System.out.println(percentage+" "+"A grade");
       }
       else if(percentage>=70)
       {
          System.out.println(percentage+" "+"B grade");
       }
       else if(percentage>=65)
       {
          System.out.println(percentage+" "+"c grade");
       }
       else if(percentage>=55)
       {
          System.out.println(percentage+" "+"D grade");
       }
       else if(percentage>=45)
       {
          System.out.println(percentage+" "+"E grade");
       }
       else 
       {
          System.out.println("Failed");
       }
     }
}