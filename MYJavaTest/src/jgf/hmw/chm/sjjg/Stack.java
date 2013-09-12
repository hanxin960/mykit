package jgf.hmw.chm.sjjg;
import java.util.*;

/**
 * 
 * @author hanxin
 * 标题：实现栈这种数据结构
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

	public ArrayList<Integer> push(int a)//定义push操作
	{
		t.add(a);
		return t;
	}
	public ArrayList<Integer> pop()//定义pop操作
	{
		if(t.size()>0)
		{
			t.remove(t.remove(t.size()-1));
		}
		return t;
	}
}
