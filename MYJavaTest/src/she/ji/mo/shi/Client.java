package she.ji.mo.shi;

/**
 * @author hanxin
 * 标题：简单工厂模式
 * 功能：客户端只需要知道父类和工厂类，不需要知道具体实现的子类，对客户端屏蔽了实现的细节，解了一定的耦合。
 * 如何扩展：添加Father的子类，并在SimpleFactory类里的switch函数里添加case语句
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father fa=SimpleFactory.getFather(2);
		fa.sayHello();//实际调用的是Children2的方法
	}

}
/**
 * 
 * @author hanxin
 * 标题：工厂类
 */
class SimpleFactory
{
	public static Father fa;
	public static Father getFather(int i)
	{
		switch (i)
		{
			case 1:
			fa=new Children1();//通过父类的变量，指向子类的对象，从而可以调用子类与父类同名方法的不同实现
			break;
			case 2:
			fa=new Children2();
			break;
		}
		return fa;
	}
}

/**
 * 父类
 */
class Father
{
	public void sayHello()
	{
		System.out.println("Father say Hello");
	}
}
/**
 * 子类1
 */
class Children1 extends Father
{
	public void sayHello()
	{
		System.out.println("Children1 say Hello");
	}
}
/**
 * 子类2
 */
class Children2 extends Father
{
	/**
	 * 方法say hello
	 */
	public void sayHello()
	{
		System.out.println("Children2 say Hello");
	}
}