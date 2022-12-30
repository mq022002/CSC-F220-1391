
public class HospitalEmployee {
	protected String name;
	protected int number;

	public HospitalEmployee(String empName, int empNumber){
		name = empName;
		number = empNumber;
	}

    //-----------------------------------------------------------------
    //  Setters and Getters
    //-----------------------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String toString(){
		return name + "\t" + number;
	}

	public void work(){
		System.out.println(name + "works for the hospital");
	}

}
