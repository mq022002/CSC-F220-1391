package pp_07_02;

public class StudentBody {

	public static void main(String[] args) {
		Address jAddress = new Address("100 Training Hill Rd", "Middletown", "CT", "06457");
		Address mAddress = new Address("1 Main Street", "Manchester", "CT", "06040");

		Student john = new Student("John Doe", jAddress);
		Student mary = new Student("Mary Doe", mAddress, 70, 77, 68);

		john.setTestScore(1, 80);
		john.setTestScore(2, 99);
		john.setTestScore(3, 90);

		System.out.println(john);
		System.out.println("-------------");
		System.out.println(mary);
	}
}