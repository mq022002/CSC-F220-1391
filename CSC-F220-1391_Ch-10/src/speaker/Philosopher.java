package speaker;

public class Philosopher implements Speaker{

	@Override
	public void speak(){
		System.out.println("An eye for an eye leaves everyone blind.");
	}

	public void pontificate(){
		System.out.println("Her was ");
	}
}
