
public class Lab3 {

	public static void main(String[] args) {
		float[] anArray = {1.1f, 2.2f, 3.3f, 4.4f, 8.8f};
		System.out.println(sumArray(anArray));

	}

	//EX8.9
	public static float sumArray(float[] values)
	{
		float sum = 0;
		for (int n=0; n<values.length; n++)
			sum += values[n];
		return sum;
	}

}
