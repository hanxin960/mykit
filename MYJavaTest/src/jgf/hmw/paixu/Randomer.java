package jgf.hmw.paixu;

import java.util.Random;

public class Randomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//����length���������������Ǵ�1��length���ظ���
	public static int[] arrayRandom(int length)
	{
		Random rnd=new Random();
		int[] nums=new int[length];
		for(int i=0;i<length;i++)
		{
			int p=rnd.nextInt(length);
			if(nums[p]!=0)
			{
				i--;
			}
			else
			{
				nums[p]=i;
			}
		}
		return nums;
	}
}
