package jgf.hmw.chm;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		i=i++ + ++i;
		int j=0;
		j=++j + j++ + j++ + j++;
		int k=0;
		k=k++ + k++ + k++ + ++k;
		int h=0;
		h=++h + ++h;
		int p1=0,p2=0; 
		int q1=0,q2=0;
		q1=++p1;
		q2=p2++;
		System.out.println("i= "+ i);
		System.out.println("j= "+ j);
		System.out.println("k= "+ k);
		System.out.println("h= "+ h);
		System.out.println("p1= "+ p1);
		System.out.println("q1= "+ q1);
		System.out.println("p2= "+ p2);
		System.out.println("q2= "+ q2);		
		
		
	}

}
