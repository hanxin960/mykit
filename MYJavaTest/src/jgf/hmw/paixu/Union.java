package jgf.hmw.paixu;

import java.util.ArrayList;





/**
 * 
 * @author hanxin
 * ���⣺ʵ��C=A��B
 */

public class Union 
{
	public static int[] A={3,5,20,8,11,2,6};//����A
	public static int[] B={2,6,8,9,11,15,5,20,44};//����B
	public static ArrayList<Integer> union(int[] A,int [] B)
	{
		ArrayList<Integer> C=new ArrayList<Integer>();
		int k=0;
		for(int t=0;t<A.length;t++)
		{
			C.add(A[t]);//�Ƚ�����Aλ��t�ϵ�Ԫ�ص�ֵ��������my��Ӧλ��t�ϵ�Ԫ��
		}
		int i=0;
		while(i<B.length)
		{
			
			for(int j=0;j<A.length;j++)
			{
				if(A[j]==B[i])//��������⣬�Ƚ��˾���ӣ�����ʵ����Ҫ�Ƚ���һ��ѭ�������
				{
					i++;//�����ͬ����ֱ�������ô�ѭ��	����䲻���١�
					break;
				}
				else//�����Ԫ�ز���ͬ
				{
					if(j==A.length-1)//�ұȽϵ��˴�ѭ�������һ��Ԫ��Ҳ��������ͬ����֤��ȫ���Ѿ��ȽϹ���
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
