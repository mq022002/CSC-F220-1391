
public class StudentBody {
	
	public static void main(String[] args) {
		Address jAddress = new Address("100 Training Hill Rd","Middletown","CT","06457");
		Address mAddress = new Address("1 Main Street","Manchester","CT","06040");
		
		Student john = new Student("John Doe", jAddress);
		Student mary = new Student("Mary Doe", mAddress);
		
		System.out.println(john);
		System.out.println("--------------------");
		System.out.println(mary);	
	}
}
