class Emp
{
	int eid;
	String dep;
	static String name;
	double salary;
	Emp(int eid,String dep,String name,double salary)
	{
		this.eid=eid;
		this.dep=dep;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return eid+" "+dep+" "+name+" "+salary;
	}
	public static void main(String []args)
	{
		Emp e=new Emp(1,"it","radha",13000);
		Emp e1=new Emp(2,"hr","ms",12000);
		System.out.println(e);
		System.out.println(e1);

	}
} 