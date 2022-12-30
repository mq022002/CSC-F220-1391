
public class Number {
	private int number;

	public Number(int Number) {
		super();
		this.number = Number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return number + "";
	}

}
