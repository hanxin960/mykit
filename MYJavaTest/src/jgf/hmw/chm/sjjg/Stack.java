package jgf.hmw.chm.sjjg;
import java.util.*;

/**
 * 
 * @author hanxin
 * ���⣺ʵ��ջ�������ݽṹ
 */
public class Stack {

	ArrayList<Integer> t=new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Stack s=new Stack();
		s.push(5);
		s.pop();
		s.push(67);
		s.push(34);
		s.pop();
	}

	public ArrayList<Integer> push(int a)//����push����
	{
		t.add(a);
		return t;
	}
	public ArrayList<Integer> pop()//����pop����
	{
		if(t.size()>0)
		{
			t.remove(t.remove(t.size()-1));
		}
		return t;
	}
}
