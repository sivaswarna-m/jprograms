class Product
{
    public static void main(String[] args) 
    {
     String producttype="Laptop";
     String brand="Dell";
     String model="Inspiration 15";
     String colours="white & Black";
     int ram=8;
     int storage=512;
     String processor="i3";
     String os="windows";
     double screensize=15.5;
     char grade='A';
     long seriesnum=17587946887l;
     float weight=(float)2.62;
     boolean ssd=false;
     boolean touchscreen=false;
     byte batterylife=7;
     short warrenty=1;
     short Extrawarrentyprice=2500;
     boolean GUIavailable=true;
     int price=65000;
     double discount=12/price*100;
     String paymentmode="online";
    if(paymentmode.equals("online"))
{
System.out.println("Google pay");
}
     short tax=60;
     double finalprice=price-discount-tax;
 System.out.println("producttype:"+producttype);
System.out.println("brand:"+brand);
System.out.println("model:"+model);
System.out.println("colours:"+colours);
System.out.println("ram:"+ram+"gb");
System.out.println("storage:"+storage+"gb");
System.out.println("processor:"+processor);
System.out.println("os:"+os);
System.out.println("screensize:"+screensize);
System.out.println("grade:"+grade);
System.out.println("seriesnum:"+seriesnum);
System.out.println("weight:"+weight);
System.out.println("ssd:"+ssd);
System.out.println("touchscreen:"+touchscreen);
System.out.println("batterylife:"+batterylife);
System.out.println("warrenty:"+warrenty+"year");
System.out.println("Extrawarrentyprice:"+Extrawarrentyprice);
System.out.println("GUIavailable:"+GUIavailable);
System.out.println("price:"+price+"rupees");
System.out.println("discount:"+discount);
System.out.println("paymentmode:"+paymentmode);
System.out.println("tax:"+tax+"rupees");
System.out.println("finalprice:"+finalprice);

}
}
     


     
     
     
