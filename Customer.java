
public class Customer {
	private int custId;
	private String cname;
	private String custMob;
	private Address addr;
	private Product prod[];
	public Customer(int custId, String cname, String custMob, Address addr, Product prod[]) {
		super();
		this.custId = custId;
		this.cname = cname;
		this.custMob = custMob;
		this.addr = addr;
		this.prod = prod;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCustMob() {
		return custMob;
	}
	public void setCustMob(String custMob) {
		this.custMob = custMob;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Product[] getProd() {
		return prod;
	}
	public void setProd(Product prod[]) {
		this.prod = prod;
	}
	
		
}
