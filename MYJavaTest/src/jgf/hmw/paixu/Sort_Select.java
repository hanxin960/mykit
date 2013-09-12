package jgf.hmw.paixu;

public class Sort_Select {

	/**
	 *@author hanxin
	 *标题：选择排序算法
	 */
	//待排序数组
	public static int[] array={12,32,34,21,32,56,3,1,3,8};

	public static int[] sort(int [] array)
	{
		int max;//记录每次循环时获取的数组元素的最大值，第一次循环时获得的是数组最大元素，第二次是第二大元素
		int position;
		for(int i=0;i<array.length;i++)
		{
			max=array[i];//max初始值
			position=i;//位置索引很重要，要不会有可能使用上一次循环position的值
			for(int j=i+1;j<array.length;j++)//j=i+1不然会与排好的数组元素再对比
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
