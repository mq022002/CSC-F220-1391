
public class Student {
	private String name;
	private Address address;

	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return name +"\n" + address;
	}
}
