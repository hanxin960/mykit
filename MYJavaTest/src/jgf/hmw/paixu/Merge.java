package jgf.hmw.paixu;

import java.util.ArrayList;

/**
 * 
 * @author hanxin
 * ���⣺���������ź�������飬�ϲ���һ���µ��ź��������
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
			if(A[i]<B[j])//��A[4]��B[4]�Ƚ�ʱ
			{
				C.add(A[i]);
				System.out.println("C["+i+"]="+A[i]+"  i="+i);
				i++;
			}
			else
			{
				C.add(B[j]);
				System.out.println("C["+j+"]="+B[j]+"  j="+j);
				j++;//ִ������һ��
			}
		}
		if(i==A.length)//��A.length������A.length-1������ʱ�����������
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
