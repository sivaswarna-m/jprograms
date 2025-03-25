public class Main
{
	public static void main(String[] args)
	{
		Student student1=new Student();
		student1.printData();
		Student student2=new Student(11,"mn","m@gmail.com","A");
		student2.printData();
	}
}
class Student
{
	int roll;
	String name,email,section;
	Student(int r,String n,String e,String s)
	{
		 roll=r;
		 name=n;
		 email=e;
		 section=s;
	}	
	Student()
	{
		roll=10;
		name="radha";
		email="r@gmail.com";
		section="A";
	}
	void printData()
	{
		System.out.println(roll+"."+name+"=>"+email+"=>"+section);
	}
}