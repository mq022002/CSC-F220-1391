package pp_07_02;

public class Student {
	private String name;
	private Address address;
	private int test1, test2, test3;

	public Student(String name, Address address, int test1, int test2, int test3) {
		super();
		this.name = name;
		this.address = address;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}

	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}

	public void setTestScore(int testNumber, int score){
		switch(testNumber){
		case 1: test1 = score;
		break;
		case 2: test2 = score;
		break;
		case 3: test3 = score;
		break;
		}
	}

	public int getTestScore(int testNumber){
		switch(testNumber){
		case 1:
			return test1 ;
		case 2:
			return test2 ;
		case 3:
			return test3 ;
		default:
			return 0;
		}
	}

	public double average(){
		return (test1 + test2 + test3)/3.0;
	}


	public String toString(){
		return name+ "\n" +address+ "\n" + test1 + "\t" + test2 + "\t" +test3+ "\nAverage: " +average();
	}
}