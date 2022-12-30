import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		double[] value = new double[10];
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		for (int n=0; n<value.length; n++){
			System.out.println("Enter number " + (n+1) +": ");
			value[n] = scan.nextDouble();
		}
		System.out.println("The number in reverse order: ");
		for(int n=value.length-1; n>=0; n--){
			System.out.println(value[n]);
		}
	}

}
