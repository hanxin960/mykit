package jgf.hmw.chm;

public class Book182NiMingNeiBuLei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book182NiMingNeiBuLei n=new Book182NiMingNeiBuLei();
			n.test();
	}
	int i=10;
	class B implements A
	{
		public void fun()
		{
			System.out.println("hanxin  "+ i+ "Ëê");
		}
	}
	public void get(A a)
	{
		a.fun();
	}
	public void test()
	{
		this.get(new B());
	}
}

interface A
{
	public void fun();
}
