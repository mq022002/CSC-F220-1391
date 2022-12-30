
public class Zero {

	public static void main(String[] args) {

//		try {
//			System.out.println(10/0);
//		} catch (Exception e) {
//			System.out.println("Can't divide by zero");
//		}

		try {
			int myInt = Integer.parseInt("MxCC");
			System.out.println(myInt);
		} catch (NumberFormatException e) {
			System.out.println("The text is not a number.");
		}
		finally {
			System.out.println("This the in finally block");
		}
	}
}
