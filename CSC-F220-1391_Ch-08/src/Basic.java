
public class Basic {

	public static void main(String[] args) {
		int list[] = new int[10];
		for (int n=0; n<10; n++){
			list[n] = n*5;
		}
		for(int value: list){
			System.out.println(value);
		}
		//Use initializer list
		int[] prime = {2, 3, 4, 5, 7, 11, 13, 17, 19};
		for(int value: prime){
			System.out.println(value);
		}
	}

}
