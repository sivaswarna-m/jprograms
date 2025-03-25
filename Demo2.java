class Demo2
{
	public static void main(String[]args)
	{
		Student s=new Student();
		s.add(10);
	}
}
class Student
{
	void add()
	{
		System.out.println("void");
	}
	void add(short a)
	{
		System.out.println("Short");
	}
	void add(byte a)
	{
		System.out.println("Byte");
	}
	void add(int a)
	{
		System.out.println("Int");
	}

	void add(long a)
	{
		System.out.println("Long");
	}
	void add(double a)
	{
		System.out.println("Double");
	}
	void add(String a)
	{
		System.out.println("String");
	}
	void add(char a)
	{
		System.out.println("Char");
	}
	void add(boolean a)
	{
		System.out.println("Boolean");
	}

}