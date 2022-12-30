import java.util.Arrays;

public class testing {

	public static void main(String a[]){

		int[] myArray  = {29, 4, 25, 10, 26, 16, 6, 22};

		insertionSort(myArray);
		System.out.println("\nAfter Insertion Sort");
		printArray(myArray);
		System.out.println("");

		selectionSort(myArray);
		System.out.println("\nAfter Selection Sort");
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

			System.out.println("Pass "+ i + " (Insertion):");
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void selectionSort(int[] arr){

		int i, j, min;

		for(i = 0; i < arr.length-1; i++){

			min = i;

			for(j = i+1; j < arr.length; j++){

				if(arr[j]<arr[min]){
					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

			System.out.println("Pass " + i + " (Selection):");
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