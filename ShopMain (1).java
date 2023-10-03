
public class ShopMain {
	

	public static void main(String[] args) {
		
		ShopInfo sinfo=new ShopInfo();
		Customer cust=sinfo.create();
		Bill billobj=sinfo.calculateBill(cust);
		sinfo.display(cust, billobj);
		
	}
}
