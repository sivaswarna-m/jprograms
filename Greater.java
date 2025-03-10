class Greater
 {
     public static void main(String args[])
     {
       int n1=33,n2=23;
       if(n1>n2)
       {
         System.out.println(n1+"is greater");
       }
       else if(n1<n2)
       {
         System.out.println(n2+"is greater");
       }
       else
       {
         System.out.println("both are equal");
       }
        System.out.println(n1==n2 ? "both are equal": ("greater num is:"+ (n1>n2 ? n1:n2)));
      }
}