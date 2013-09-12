package jgf.hmw.paixu;

public class Sort_Bubble_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] barray=Bubble2(array);
		for(int i=0;i<barray.length;i++)
		{
			System.out.println(barray[i]);
		}
	}
	
	static int []array={1,3,5,2,34,6,2,8,3,8,9};
	static int [] Bubble(int []array)
	{
		int temp;
		for(int i=0;i<array.length;i++)
		{
			for(int j=array.length-1;j>i;j--)
			{
				if(array[j]<array[j-1])
				{
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		return array;
	}
	static int [] Bubble2(int []array)
	{
		int temp;
		for(int j=array.length-1;j>=0;j--)
		{
			for(int i=0;i<j;i++)
			{
				if(array[i]<array[i+1])
				{
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
		return array;
	}

}
