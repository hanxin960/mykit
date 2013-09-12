package jgf.hmw.chm;

public class Staticfinal {

	/**
	 * @param args
	 */
	final int num =5;//成员常量可以在定义时初始化，也可以在构造函数中初始化
	int[] dataSet={1,2,3,4,5};
	
	
	public int[] getDataSet() {
		return dataSet;
	}
	public void setDataSet(int[] dataSet) {
		this.dataSet = dataSet;
	}

	
	public Staticfinal()
	{
		//		num=6;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
