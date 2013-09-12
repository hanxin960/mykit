package jgf.hmw.chm;

public class Book101MaxMin2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[]a=new int[]{1,20,3,10,15};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			max=max(max,a[i]);
			min=min(min,a[i]);
		}
		System.out.println("the min value is "+min);
		System.out.println("the max value is "+max);

	}
	
	static int max(int a,int b)
	{
		return a>=b?a:b;	
	}
	static int min(int a,int b)
	{
		return a<=b?a:b;	
	}

}
