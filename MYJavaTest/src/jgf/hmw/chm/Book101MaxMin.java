package jgf.hmw.chm;

public class Book101MaxMin {

	public static void main(String args[])
	{
		int[]a=new int[]{1,20,3,10,15};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("the min value is "+min);
		System.out.println("the max value is "+max);
	}

}
