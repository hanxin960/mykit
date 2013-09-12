package jgf.hmw.paixu;
/**
 * 
 * @author ������
 * ���⣺ð�������㷨	
 * ���ڣ�2013.8.8
 * ���飺
 *
 */
public class Sort_Bubble {

	//������������
	public static int[] array={1,4,23,54,2,65,21,123,12,34};
	//�����㷨 �Ӵ���С
	public static int[] sortDown(int[] array)
	{
		
		for(int i=array.length-1;i>=1;i--)
		{
			//��array.length=nʱ��i=n-1
			for(int j=0;j<i;j++)
			{
				//��i=n-1ʱ��j=n-2,j+1=n-1;
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
	//�����㷨 ��С����
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
	//�����㷨
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********������Ԫ�ؽ�����������*********");
		int []upsortInt=sort(array,true);//��������
		for(int i=0;i<upsortInt.length;i++)
		{
			System.out.println(upsortInt[i]);
		}
		System.out.println("*********������Ԫ�ؽ��н�������*********");		
		int []downsortInt=sort(array,false);//��������
		for(int i=0;i<downsortInt.length;i++)
		{
			System.out.println(downsortInt[i]);
		}
	}
}
