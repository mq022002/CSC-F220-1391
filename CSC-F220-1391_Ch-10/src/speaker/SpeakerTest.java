package speaker;

public class SpeakerTest {

	public static void main(String[] args){

		Speaker speaker1 = new Dog();
		Speaker speaker2 = new Philosopher();

		speaker1.speak();
		speaker2.speak();

		((Philosopher)speaker2).pontificate();
	}
}
