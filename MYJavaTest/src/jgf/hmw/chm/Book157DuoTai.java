package jgf.hmw.chm;

public class Book157DuoTai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Student();
		p.fun1();
		p.fun2();
	}

}

class Person
{
	public void fun1()
	{
		System.out.println("father 1");
	}
	public void fun2()
	{
		System.out.println("father 2");
	}
}

class Student extends Person
{
	public void fun1()
	{
		System.out.println("my 1");
	}
	public void fun3()
	{
		System.out.println("my 3");
	}
	
}
