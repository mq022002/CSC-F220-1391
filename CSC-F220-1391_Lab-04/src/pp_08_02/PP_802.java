package pp_08_02;

import java.util.Scanner;

public class PP_802 {

	public static void main(String[] args) {
		int[] counts = new int[51];
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter integers between -25 to 25 (<-25 or >25 to quit)");

		int input = scan.nextInt();
		while (input >= -25 && input <= 25){
			input = input + 25;
			counts[input]++;
			input = scan.nextInt();
		}
		System.out.println("Number\tTimes");
		for(int n=0; n<=50; n++)
			if (counts[n] >= 1)
			System.out.println((n-25) + "\t" + counts[n]);
	}
}
