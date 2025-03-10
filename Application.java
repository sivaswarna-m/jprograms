class App
{
    public static void main(String[] args) 
    {
     String appname="amazon";
     String customername="Radha";
     String product="phone";
     long deliverynum=6675666788l;
     long couponcode=4353156;
     float price=(float)(254.46);
     int quantity=55;
     byte deliverycharges=16;
     short tax=(short)(12.67);
     double totalprice=(price*quantity)+deliverycharges;
     double discount=(15/totalprice)*100;
String payment_mode="online";
if(payment_mode.equals("online"))
{
    System.out.println("Googlepay");
}
     int upidiscount=5;
     double upidispercentage=(5/totalprice)*100;
     float finalprice=(float)(totalprice-discount-upidispercentage);
     boolean deliverystatus=true;
     boolean customersatisfaction=true;
     System.out.println(appname);
     System.out.println(customername);
     System.out.println(product);
     System.out.println(deliverynum);
     System.out.println(price);
     System.out.println(totalprice);
     System.out.println(discount);
     System.out.println(upidispercentage);
     System.out.println(finalprice);
     System.out.println(deliverystatus);
     System.out.println(customersatisfaction);

     
     
     
       }
}
