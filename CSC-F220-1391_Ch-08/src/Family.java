
public class Family {
	private String[] members;

	public Family(String... names){
		members = names;
	}

	public String toString(){
		String str = "";
		for(String name: members)
			str += name + "\t";
		return str;
	}
}
