package array;

import java.util.Scanner;

public class Array{
	public static void main(String[] args) {

		int i = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want in your array? ");
		int number = scan.nextInt();
		int[] test = new int[number];

		while (i < number) {
			System.out.println("Number " + i + ": ");
			test[i] = scan.nextInt();
			i++;
			}
		System.out.print("Before swapping: ");

		i = 0;
		while (i < number) {
			System.out.print(test[i] + " ");
			i++;
		}

		i = 0;
		while (i <= number / 2) {
			int temp = test[i];
			test[i] = test[(number - i - 1)];
			test[(number - i - 1)] = temp;
			i++;
			}

		System.out.println("");
		System.out.print("After swapping: ");

		i = 0;
		while (i <= number - 1) {
			System.out.print(test[i] + " ");
			i++;
		}
	}
}