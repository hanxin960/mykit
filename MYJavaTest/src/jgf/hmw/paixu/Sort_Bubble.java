package jgf.hmw.paixu;
/**
 * 
 * @author 江国富
 * 标题：冒泡排序算法	
 * 日期：2013.8.8
 * 简介：
 */
public class Sort_Bubble {

	//待排序的数组
	public static int[] array={1,4,23,54,2,65,21,123,12,34};
	//排序算法 从大到小
	public static int[] sortDown(int[] array)
	{
		
		for(int i=array.length-1;i>=1;i--)
		{
			//当array.length=n时，i=n-1
			for(int j=0;j<i;j++)
			{
				//当i=n-1时，j=n-2,j+1=n-1;
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
	//排序算法 从小到大
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
	//排序算法
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
		System.out.println("*********对数组元素进行升序排序*********");
		int []upsortInt=sort(array,true);//升序排序
		for(int i=0;i<upsortInt.length;i++)
		{
			System.out.println(upsortInt[i]);
		}
		System.out.println("*********对数组元素进行降序排序*********");		
		int []downsortInt=sort(array,false);//降序排序
		for(int i=0;i<downsortInt.length;i++)
		{
			System.out.println(downsortInt[i]);
		}
	}
}
