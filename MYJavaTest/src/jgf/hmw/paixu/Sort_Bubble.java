package jgf.hmw.paixu;

public class Sort_Bubble {


	public static int[] array={1,4,23,54,2,65,21,123,12,34};

	public static int[] sortDown(int[] array)
	{
		
		for(int i=array.length-1;i>=1;i--)
		{
		
			for(int j=0;j<i;j++)
			{
			
				if(array[j]<array[j+1])
				{
					int temp;
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}

	public static int[] sortUp(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			
			for(int j=array.length-1;j>i;j--)
			{
				if(array[j]<array[j-1])
				{
					int temp;
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		return array;
	}

	public static int[] sort(int [] array,boolean up)
	{
		if(up)
		{
			return sortUp(array);
		}
		else
		{
			return sortDown(array);
		}
	}
	public static void main(String[] args) {

		System.out.println("*********������Ԫ�ؽ�����������*********");
		int []upsortInt=sort(array,true);
		for(int i=0;i<upsortInt.length;i++)
		{
			System.out.println(upsortInt[i]);
		}
		System.out.println("*********������Ԫ�ؽ��н�������*********");		
		int []downsortInt=sort(array,false);
		for(int i=0;i<downsortInt.length;i++)
		{
			System.out.println(downsortInt[i]);
		}
	}
}
