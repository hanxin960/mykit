package jgf.hmw.paixu;

public class Sort_Select {

	/**
	 *@author hanxin
	 *���⣺ѡ�������㷨
	 */
	//����������
	public static int[] array={12,32,34,21,32,56,3,1,3,8};

	public static int[] sort(int [] array)
	{
		int max;//��¼ÿ��ѭ��ʱ��ȡ������Ԫ�ص����ֵ����һ��ѭ��ʱ��õ����������Ԫ�أ��ڶ����ǵڶ���Ԫ��
		int position;
		for(int i=0;i<array.length;i++)
		{
			max=array[i];//max��ʼֵ
			position=i;//λ����������Ҫ��Ҫ�����п���ʹ����һ��ѭ��position��ֵ
			for(int j=i+1;j<array.length;j++)//j=i+1��Ȼ�����źõ�����Ԫ���ٶԱ�
			{
				if(max<array[j])
				{
					max=array[j];
					position=j;
				}
			}
			array[position]=array[i];	
			array[i]=max;
		}
		return array;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] downaort=sort(array);
		for(int i=0;i<downaort.length;i++)
		{
			System.out.println(downaort[i]);
		}
	}	
}
