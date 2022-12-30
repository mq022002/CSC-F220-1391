package extra_credit_c;

import java.util.Arrays;

public class Sorting {

	public static void main(String a[]){

		int[] myArray  = {29, 4, 25, 10, 26, 16, 6, 22};

		insertionSort(myArray);

		System.out.println("After Insertion Sort");

		printArray(myArray);
	}

	public static void insertionSort(int arr[]){

		int n = arr.length;

		for (int i = 1; i < n; i++){

		int key = arr[i];
		int j = i-1;

		while ( (j > -1) && ( arr [j] > key ) ){
			arr [j+1] = arr [j];
			j--;
		}
		arr[j+1] = key;

		System.out.println("Pass "+ (i) + ":");
		System.out.println(Arrays.toString(arr));
		}
	}

	static void printArray(int[] array){

		for(int i=0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}

		System.out.println();
	}
}