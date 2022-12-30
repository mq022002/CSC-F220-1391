package problem_1;

public class Person{

	String first, last;
	int phone;

	public Person(String first, String last, int phone) {
		super();
		this.first = first;
		this.last = last;
		this.phone = phone;
	}

	public String toString(){
		return first + "\t\t" + last + "\t\t" + phone;
	}
}