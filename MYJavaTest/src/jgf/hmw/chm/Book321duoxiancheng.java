package jgf.hmw.chm;

public class Book321duoxiancheng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new myThread1().start();
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"  main");
		}
	}

}
class myThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" myThread");
		}
	}
}
