class Discount
	{
	   public static void main(String main[])
	    {
		String pname="dress";
		long pcode=1563868;
		int pprice=356;
		int pquantity=15;
		int ptotal=pprice*pquantity;
		 System.out.println("pname="+ pname);
		 System.out.println("pcode="+ pcode);
		 System.out.println("pprice="+ pprice);
		 System.out.println("pquantity="+ pquantity);
		 System.out.println("ptotal="+ ptotal);

                if(ptotal<1000)
	        {
                    double discount=0;
		    double finaltotal=ptotal-discount;
		    double tax=18.0/100*finaltotal;
		    double bill=finaltotal+tax;
		     System.out.println("discount="+ discount);
		     System.out.println("final price="+ finaltotal);
		     System.out.println("tax="+ tax);
		     System.out.println("final bill is ="+bill);

		}
		else if(ptotal>=1000&&ptotal<2000)
		{
		   double discount=10.0/100*ptotal;
			if(discount>200)
			{
			  discount=200;
			}
					
		   double finaltotal=ptotal-discount;
		   double tax=18.0/100*finaltotal;
		   double bill=finaltotal+tax;
		    System.out.println("discount="+ discount);
		    System.out.println("final price="+finaltotal);
		    System.out.println("tax="+ tax);
		    System.out.println("final bill is ="+bill);
                }
		else if(ptotal>=2000&&ptotal<3000)
		{
		   double discount=15.0/100*ptotal;
		   double finaltotal=ptotal-discount;
		   double tax=18.0/100*finaltotal;
		   double bill=finaltotal+tax;
		    System.out.println("discount="+discount);
		    System.out.println("final price="+finaltotal);
		    System.out.println("tax="+ tax);
		    System.out.println("final bill is ="+bill);

		}
		
		else if(ptotal>=3000&&ptotal<4000)
		{
		   double discount=20.0/100*ptotal;
		   double finaltotal=ptotal-discount;
	           double tax=18.0/100*finaltotal;
		   double bill=finaltotal+tax;
		    System.out.println("discount="+ discount);
		    System.out.println("final price="+ finaltotal);
		    System.out.println("tax="+ tax);
		    System.out.println("final bill is ="+ bill);

		}
		
		else 
		{
		   double discount=30.0/100*ptotal;
			if(discount>2000)
			{
			   discount=1000;
			}
		   double finaltotal=ptotal-discount;
		   double tax=18.0/100*finaltotal;
		   double bill=finaltotal+tax;
		    System.out.println("discount="+ discount);
		    System.out.println("final price="+ finaltotal);
		    System.out.println("tax="+ tax);
		    System.out.println("final bill is ="+ bill);

		}
	}
}
