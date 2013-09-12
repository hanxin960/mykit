package jgf.hmw.chm;

public class Book24 {

	/**
	 * @param args
	 */
	final int age;
	public Book24()
	{
		age=24;
	}
	static int g;
	static long k;
	static char m;
	static float t;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=2;
		System.out.println(x/y);
		System.out.println(g);
		System.out.println(k);
		System.out.println(m);
		System.out.println(t);
		int i=0;
		int sum=0;
		
		int j=0;
		int sum2=0;
		int sum3=0;
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		do
		{
			sum2+=j;
			j++;
		}while(j<=100);
		
		for(int p=0;p<=100;p++)
		{
			sum3+=p;	
		}
		System.out.println(sum+"	"+sum2+"	"+sum3);
	}

}
