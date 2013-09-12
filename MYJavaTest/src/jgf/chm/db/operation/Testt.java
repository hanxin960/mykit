package jgf.chm.db.operation;

public class Testt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}

}
class MyThread implements Runnable
{
	private int ti=20;
	public void run()
	{
		while(true)
		{
			if(ti>0)
			{
				System.out.println(Thread.currentThread().getName()+" "+ti--);
			}
		}
	}
}
