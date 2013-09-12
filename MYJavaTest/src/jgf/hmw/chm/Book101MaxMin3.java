package jgf.hmw.chm;

public class Book101MaxMin3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxMin mm=new MaxMin();
		int a[]=new int[]{1,20,3,10,15};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			max=mm.setMax(max, a[i]);
			min=mm.setMin(min, a[i]);
		}
		System.out.println("the min value is "+min);
		System.out.println("the max value is "+max);
	}
	
	
  

}

class MaxMin
{
	public int setMax(int a,int b)
	{
		return a>=b?a:b;
	}
	public int setMin(int a,int b)
	{
		return a<=b?a:b;
	}
}
