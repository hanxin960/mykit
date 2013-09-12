package jgf.hmw.chm.sjjg;

public class LinkList {

	static LNode t;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t=new LNode();
		t.data=5;
		t.next=new LNode();
		t.next.data=10;
		t.next.next=null;
		System.out.println();
	}

	
	

}
class LNode
{
	
	int data;
	LNode next;
}
