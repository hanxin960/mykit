package jgf.hmw.paixu;

public class Recursive {

	/**
	 * @author hanxin
	 * ���⣺ʵ�ּ����ݹ麯�����׳˺�����Fibonacci��Ackerman��
	 * �ο���http://wenwen.soso.com/z/q364050302.htm��ע����������ֻ�Ǳ��������������ǲ���������hanxin��Ҳ���˽⡿
	 * ����A�ʣ� ���еݹ����ⶼ������ѭ���������
	 * ����B��...
	 * ����C�� �ݹ�����Ǻ����Լ������Լ�����������У����������������˺ܶ��м�����������ֵ���乤����
	 *     ������Լ���ѭ����ʵ�֣�������Щ���������Ĺ����������Լ��������鷳�����׳���
	 *     ���Ƕ�Ч�ʴ�ë��ã����򲻽�������ѭ��������ݹ���á�
	 */
	
	//�׳˺���1*2*3*4����Ȼ��Ҳ������ѭ��������
	public static int factorial(int n)
	{
		if(n==1)//��ֹ����
		{
			return 1;
		}
		else
		{
			return factorial(n-1)*n;//�ݹ�
		}
	}
	//ѭ����ʽ
	public static int factorial2(int n)
	{
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product*=i;
		}
		return product;
	}
	
	
	//Fibonacci���� 0,1,1,2,3...�ӵ���������ʼ��ÿ������ǰ���������ĺ͡����˭��ѭ����ʽʵ�ֲ��������Է���һ�¡�
	public static int fibonacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	//Ackerman�������������������ʱ������ʵ�ֹ�������������ѿ���������һ�´�����лл��
	public static int Ackerman(int m,int n)
	{
		if(m==0)
		{
			return n+1;
		}
		else if(n==0)
		{
			return Ackerman(m-1,1);
		}
		else
		{
			return Ackerman(m-1,Ackerman(m,n-1));
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fac=factorial(5);
		System.out.println(fac);
		
		int fac2=factorial2(5);
		System.out.println(fac2);
		
		
		int fib=fibonacci(6);
		System.out.println(fib);
		
//		int ack=Ackerman(5, 1);
//		int ack1=Ackerman(0, 4);
		int ack2=Ackerman(5, 0);
		System.out.println("ack"+"\t"+"ack1"+"\t"+ack2);
	}

}
