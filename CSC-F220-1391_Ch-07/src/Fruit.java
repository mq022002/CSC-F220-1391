
public class Fruit {
	private String name;
	private static int count = 0;
	
	public Fruit(String n){
		name = n;
		count++;
	}
	
	public static int getCount(){
		return count;
	}
	
	public String toString(){
		return name;
	}

}
