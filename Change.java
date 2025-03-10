class Change
{
public static void main(String args[])
{
int n=155;
char cap='S';
char small='n';
System.out.println(n>100 ? (char)(cap+32):(char)(small-32));
if(n>100)
{
 System.out.println((char)(cap+32));
}
else
{
System.out.println((char)(small-32));
}
}
}
