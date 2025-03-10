class Square
{
public static void main(String ags[])
{
int num=625;
double r=Math.sqrt(num);
System.out.println(r);
boolean a=(num%r==0 ? true:false);
System.out.println("number is a perfect Square:"+a);
if(num%r==0)
{
System.out.println(num+" "+"is a perfect square");
}
else
{
System.out.println(num+" "+"is  not a perfect square");
}
}
}