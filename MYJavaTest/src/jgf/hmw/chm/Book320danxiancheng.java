package jgf.hmw.chm;

public class Book320danxiancheng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new myThread().run();
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"  main");
		}
	}

}

class myThread 
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(i+" myThread");
		}
	}
	
}
