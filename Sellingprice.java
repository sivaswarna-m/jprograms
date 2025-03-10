class Sellingprice
{
public static void main(String args[])
{
int buying_price=60;
int selling_price=55;
if(selling_price>buying_price)
{
System.out.println("profit:"+(selling_price-buying_price));
}
else
{
System.out.println("loss:"+(buying_price-selling_price));
}
}
}