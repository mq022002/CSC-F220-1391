
public class Passing {

	public static void main(String[] args) {
		int a1 = 111;
		Number a2 = new Number(222);
		Number a3 = new Number(333);

		Change c = new Change();
		c.change(a1, a2, a3);

		System.out.println(a1+"\n"+a2+"\n"+a3);

	}

}
