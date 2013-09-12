package jgf.hmw.paixu;

public class Recursive {

	/**
	 * @author hanxin
	 * 标题：实现几个递归函数【阶乘函数、Fibonacci、Ackerman】
	 * 参考：http://wenwen.soso.com/z/q364050302.htm【注：资料引用只是标明出处，具体是不是这样，hanxin我也不了解】
	 * 网友A问： 所有递归问题都可以用循环来解决吗？
	 * 网友B答：...
	 * 网友C答： 递归调用是函数自己调用自己，具体过程中，编译器帮我们做了很多中间变量保存和数值传输工作，
	 *     你可以自己用循环来实现，但是那些编译器作的工作都得你自己来做，麻烦且容易出错。
	 *     除非对效率吹毛求疵，否则不建议你用循环来替代递归调用。
	 */
	
	//阶乘函数1*2*3*4【当然这也可以用循环来做】
	public static int factorial(int n)
	{
		if(n==1)//终止条件
		{
			return 1;
		}
		else
		{
			return factorial(n-1)*n;//递归
		}
	}
	//循环方式
	public static int factorial2(int n)
	{
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product*=i;
		}
		return product;
	}
	
	
	//Fibonacci数列 0,1,1,2,3...从第三个数开始，每个数是前边两个数的和【如果谁有循环方式实现不妨留个言分享一下】
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
	
	//Ackerman函数【这个函数在运行时报错，有实现过这个函数的朋友可以做贡献一下代码吗？谢谢】
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
