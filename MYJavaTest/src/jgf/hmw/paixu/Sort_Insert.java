package jgf.hmw.paixu;

public class Sort_Insert {

	/**
	 * @author hanxin
	 * ���⣺���������㷨
	 */
	//����������
	public static int [] array={4,2,5,8,3,7,1,9,6};
	//���������㷨
	public static int [] inSort(int [] darray)
	{
		if(darray[0]>darray[1])//����ǰ����������Ԫ��
		{
			int temp=darray[0];
			darray[0]=darray[1];
			darray[1]=temp;
		}
		for(int i=2;i<darray.length;i++)//�����ߵ�����Ԫ��
		{
			for(int j=0;j<i;j++)//�ڲ�ѭ�������ѭ���Ĺ�ϵҪ֪��{���i,j�й�ϵ�Ļ�}
			{		
				int temp=darray[i];
				if(darray[j]<darray[i])//�����߲����Ԫ�ر����ź����ĳ����
				{
					if(darray[j+1]>darray[i])//�ֱ����е�ĳ��С
					{
						for(int k=i;k>j;k--)//��ܹؼ������˺þò��뵽��
						{
							darray[k]=darray[k-1];//���ƶ���ߵ�Ԫ�أ�ֱ���Ǹ�λ��j+1
						}
						darray[j+1]=temp;//����
					}
				}	
				else//�����߲����Ԫ�ر����еĶ�С
				{
					for(int k=i;k>0;k--)
					{
						darray[k]=darray[k-1];//��ȫ��Ԫ�غ���
					}
					darray[0]=temp;//���뵽��һ��λ��
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
