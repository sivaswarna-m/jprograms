 class Threading_syn
{

	public static void main(String[] args) 
	{
		Sample s=new Sample();
		Thread t1=new Thread(s,"t1");
		t1.start();
		Thread t2=new Thread(s,"t2");
		t2.start();
		

	}

}
class Sample implements Runnable
{
	int count;
	public void run()
	{
		for(int x=0;x<10;x++)
		System.out.println(Thread.currentThread().getName()+" "+(++count));
	}
}
