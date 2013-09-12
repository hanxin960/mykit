package jgf.hmw.chm;

public class Alibaba {

	private static final String MESSAGE = "taobao";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String a="tao"+"bao";
		// String b="tao";
		// String c="bao";
		// System.out.println(a==MESSAGE);
		// System.out.println((b+c)==MESSAGE);

		Counter a = new Counter();
		System.out.println(a.increment());
		System.out.println(a.anotherIncrement());
		Counter b = new Counter();
		System.out.println(b.increment());
	}
}

class Counter {
	private static int count = 0;

	public int increment() {
		return count++;
	}

	public int anotherIncrement() {
		return ++count;
	}

}
