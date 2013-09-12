package jgf.hmw.paixu;

import java.util.ArrayList;

/**
 * 
 * @author hanxin
 * 标题：将两个已排好序的数组，合并成一个新的排好序的数组
 *
 */
public class Merge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> C=mergeAB(A, B);
		System.out.println(C.size());
		for(int i=0;i<C.size();i++)
		{
			System.out.println(C.get(i));
		}
	}
	public static int[]A={2,3,6,9,12,15};
	public static int[]B={3,4,6,8,10,12,14,17,135,234};
	public static ArrayList<Integer> mergeAB(int []A,int []B)
	{
		ArrayList<Integer> C=new ArrayList<Integer>();
		int i=0,j=0;
		while(i<A.length && j<B.length)
		{
			if(A[i]<B[j])//当A[4]与B[4]比较时
			{
				C.add(A[i]);
				System.out.println("C["+i+"]="+A[i]+"  i="+i);
				i++;
			}
			else
			{
				C.add(B[j]);
				System.out.println("C["+j+"]="+B[j]+"  j="+j);
				j++;//执行了这一句
			}
		}
		if(i==A.length)//是A.length而不是A.length-1，调试时发现这个错误
		{
			while(j<B.length)
			{
				C.add(B[j]);
				System.out.println("C["+j+"]="+B[j]+"  j="+j);
				j++;
			}
		}
		if(j==B.length)
		{
			while(i<A.length)
			{
				C.add(A[i]);
				System.out.println("C["+i+"]="+A[i]+"  i="+i);
				i++;
			}
		}		
		return C;
	}	
}
