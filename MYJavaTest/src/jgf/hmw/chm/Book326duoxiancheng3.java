package jgf.hmw.chm;

public class Book326duoxiancheng3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		myThread4 t=new myThread4();
//		t.start();
//		t.start();
//		t.start();
		new myThread4().start();
		new myThread4().start();
		new myThread4().start();
		new myThread4().start();
	}

}

class myThread4 extends Thread
{
	private int tickets=20;
	public void run()
	{
			while(true)
			{
				if(tickets>0)
					System.out.println(Thread.currentThread().getName()+" sale "+tickets--);
			}
	}
}
