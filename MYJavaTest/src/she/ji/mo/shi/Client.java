package she.ji.mo.shi;

/**
 * @author hanxin
 * ���⣺�򵥹���ģʽ
 * ���ܣ��ͻ���ֻ��Ҫ֪������͹����࣬����Ҫ֪������ʵ�ֵ����࣬�Կͻ���������ʵ�ֵ�ϸ�ڣ�����һ������ϡ�
 * �����չ�����Father�����࣬����SimpleFactory�����switch���������case���
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father fa=SimpleFactory.getFather(2);
		fa.sayHello();//ʵ�ʵ��õ���Children2�ķ���
	}

}
/**
 * 
 * @author hanxin
 * ���⣺������
 */
class SimpleFactory
{
	public static Father fa;
	public static Father getFather(int i)
	{
		switch (i)
		{
			case 1:
			fa=new Children1();//ͨ������ı�����ָ������Ķ��󣬴Ӷ����Ե��������븸��ͬ�������Ĳ�ͬʵ��
			break;
			case 2:
			fa=new Children2();
			break;
		}
		return fa;
	}
}

/**
 * ����
 */
class Father
{
	public void sayHello()
	{
		System.out.println("Father say Hello");
	}
}
/**
 * ����1
 */
class Children1 extends Father
{
	public void sayHello()
	{
		System.out.println("Children1 say Hello");
	}
}
/**
 * ����2
 */
class Children2 extends Father
{
	/**
	 * ����say hello
	 */
	public void sayHello()
	{
		System.out.println("Children2 say Hello");
	}
}