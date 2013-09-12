package jgf.hmw.paixu;

import java.util.ArrayList;





/**
 * 
 * @author hanxin
 * 标题：实现C=A并B
 */

public class Union 
{
	public static int[] A={3,5,20,8,11,2,6};//数组A
	public static int[] B={2,6,8,9,11,15,5,20,44};//数组B
	public static ArrayList<Integer> union(int[] A,int [] B)
	{
		ArrayList<Integer> C=new ArrayList<Integer>();
		int k=0;
		for(int t=0;t<A.length;t++)
		{
			C.add(A[t]);//先将数组A位置t上的元素的值赋给数组my对应位置t上的元素
		}
		int i=0;
		while(i<B.length)
		{
			
			for(int j=0;j<A.length;j++)
			{
				if(A[j]==B[i])//问题出在这，比较了就添加，可是实际是要比较完一次循环才添加
				{
					i++;//如果相同，则直接跳过该次循环	【这句不能少】
					break;
				}
				else//如果两元素不相同
				{
					if(j==A.length-1)//且比较到此次循环的最后一个元素也不存在相同【即证明全部已经比较过】
					{
						C.add(B[i]);
						k++;
						i++;				
					}
				}
			}
		}
		
		return C;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> C=union(A, B);
		for(int i=0;i<C.size();i++)
		{
			System.out.println(C.get(i));
		}
	}
}
