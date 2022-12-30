
public class ExceptionLevels {

	public static void main(String[] args) {
		level1();
	}

	public static void level1(){
		try {
			level2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void level2(){
		level3();
	}

	public static void level3(){
		System.out.println(10/0);
	}
}
