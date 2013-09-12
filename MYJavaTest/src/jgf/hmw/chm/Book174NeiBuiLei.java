package jgf.hmw.chm;

public class Book174NeiBuiLei {

	/**
	 * @param args
	 */
	private int age=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book174NeiBuiLei outer=new Book174NeiBuiLei();
		outer.inst();
	}
	void inst()
	{
		Inner in=new Inner();
		in.display();
	}
	
	class Inner
	{
		void display()
		{
			System.out.println(age);
		}
	}
	
	
}
