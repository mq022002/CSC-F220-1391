import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Question q1 = new Question("What is 3/2?", "1.5");
		q1.setLevel(1);

		Question q2 = new Question("What is 5!?", "120");
		q2.setLevel(4);

		process(q1);
		process(q2);

	}

	public static void process(Question q){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(q.getQuestion());
		System.out.println("Level: " + q.getLevel());

		String response = scan.nextLine();
		if(response.equals(q.getAnswer()))
			System.out.println("Correct!");
		else
			System.out.println("Incorrect, the correct answer is: " +q.getAnswer());

	}

}
