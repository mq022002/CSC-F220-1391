package pp_08_01;

import java.util.Scanner;

public class PP_801 {

	public static void main(String[] args) {
		int[] occurences = new int[51];
		System.out.println("Enter integers in the range of 0 and 50 "
				+ "(enter a number outside the range to end the input): ");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
		while(input >= 0 && input <= 50){
			occurences[input] ++;
			input = scan.nextInt();
		}
		System.out.println("Number\tTimes");
		for(int n=0; n<=50; n++)
			if(occurences[n] >= 1)
				System.out.println(n + "\t" + occurences[n]);
	}
}
