class Library 
 {
     public static void main(String args[])
     {
       int days=35;
       int book_price=200;
       int charge=10;
       if(days<0)
       {
          System.out.println("invalid input");
       }

       else if(days<31)
       {
         System.out.println("no need to pay ");
       }
       else if(days==31)
       {
         System.out.println("need to pay"+book_price);
       }
       else if(days>31)
       {
         System.out.println("need to pay"+(charge*days));
       }
       else 
       {
          System.out.println("invalid input");
       }
    	  System.out.println("___________________________________________");
          String occupation="student";
          String quali="degree";
	  System.out.println(occupation=="student"?(quali=="degree"||quali=="btech"||quali=="bsc"? days*30:(quali=="inter"||quali=="ssc"?days*20:days*40)):days*40);
		
    }
}



         