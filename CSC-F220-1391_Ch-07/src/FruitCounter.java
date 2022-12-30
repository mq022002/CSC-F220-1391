
public class FruitCounter {

	public static void main(String[] args) {
		Fruit fruit = new Fruit("apple");
		System.out.println(fruit);
		
		fruit = new Fruit("orange");
		System.out.println(fruit);
		
		fruit = new Fruit("banana");
		System.out.println(fruit);
		
		System.out.println("Fruits created: " + Fruit.getCount());

	}

}
