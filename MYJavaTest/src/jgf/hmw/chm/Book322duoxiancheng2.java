package jgf.hmw.chm;

public class Book322duoxiancheng2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new myThread2()).start();
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" main");
		}
		
	}

}
class myThread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+" myThread");
		}
	}
}