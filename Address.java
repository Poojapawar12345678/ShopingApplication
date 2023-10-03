
public class Address {
	private String city;
	private String State;
	private int prinCode;
	public Address(String city, String state, int prinCode) {
		super();
		this.city = city;
		State = state;
		this.prinCode = prinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPrinCode() {
		return prinCode;
	}
	public void setPrinCode(int prinCode) {
		this.prinCode = prinCode;
	}
	

}
