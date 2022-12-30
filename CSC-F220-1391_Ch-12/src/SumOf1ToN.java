//	Calculate the sum of 1 through N
//	using iterative method and
//	recursive method
public class SumOf1ToN {

	public static void main(String[] args) {
		int result = iterative(10);
		System.out.println(result);
		result = recursive(10);
		System.out.println(result);

	}

	public static int iterative(int num){
		int sum = 0;
		for(int n = 1; n <= num; n++)
			sum += n;

		return sum;
	}

	public static int recursive(int num){

		int sum;
		if(num ==1)
			sum = 1;
		else
			sum = num + recursive(num - 1);

		return sum;
	}
}
