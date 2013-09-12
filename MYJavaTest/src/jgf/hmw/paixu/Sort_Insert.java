package jgf.hmw.paixu;

public class Sort_Insert {

	/**
	 * @author hanxin
	 * 标题：插入排序算法
	 */
	//待插入数组
	public static int [] array={4,2,5,8,3,7,1,9,6};
	//插入排序算法
	public static int [] inSort(int [] darray)
	{
		if(darray[0]>darray[1])//处理前边两个数组元素
		{
			int temp=darray[0];
			darray[0]=darray[1];
			darray[1]=temp;
		}
		for(int i=2;i<darray.length;i++)//处理后边的数组元素
		{
			for(int j=0;j<i;j++)//内层循环与外层循环的关系要知道{如果i,j有关系的话}
			{		
				int temp=darray[i];
				if(darray[j]<darray[i])//如果后边插入的元素比已排好序的某个大
				{
					if(darray[j+1]>darray[i])//又比其中的某个小
					{
						for(int k=i;k>j;k--)//这很关键，想了好久才想到的
						{
							darray[k]=darray[k-1];//则移动后边的元素，直到那个位置j+1
						}
						darray[j+1]=temp;//插入
					}
				}	
				else//如果后边插入的元素比所有的都小
				{
					for(int k=i;k>0;k--)
					{
						darray[k]=darray[k-1];//则全部元素后移
					}
					darray[0]=temp;//插入到第一个位置
				}			
			}
		}
		return darray;
	}	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sort=inSort(array);
		for(int i=0;i<sort.length;i++)
		{
			System.out.println(sort[i]);
		}
	}
}
