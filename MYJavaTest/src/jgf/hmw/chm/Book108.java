package jgf.hmw.chm;

public class Book108 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={25,24,12,76,98,101,90,28};
		int array2[]=arrayPS(array);
		for(int i=0;i<array2.length;i++)
		{
			System.out.println(array2[i]);
		}
		
	}
	
	public static int [] arrayPS(int array[])
	{
		int temp=0;
		for(int i=array.length-1; i>0;i--)
		{
			if(array[i]>array[i-1])
			{
				temp=array[i];
				array[i]=array[i-1];
				array[i-1]=temp;
			}
		}
		return array;
	}

}
