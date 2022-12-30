
public class Address {
	private String street, city, state, zip;
	
	public Address(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return street + "\n" + city + ", " + state + " " + zip;
	}
}
