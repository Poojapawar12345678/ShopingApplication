import java.util.Scanner;
import java.util.Date;
public class ShopInfo {
	public Customer create()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Customer Id");
		int custId=sc.nextInt();
		System.out.println("Enter customer Name:");
		String cname=sc.next();
		System.out.println("Enter Mobile Number:");
		String custMob=sc.next();
		
		
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter state:");
		String state=sc.next();
		System.out.println("Enter pincode:");
		int pincode=sc.nextInt();
		Address addr=new Address(city,state,pincode);
		
		System.out.println("how many product do you want ");
		int size=sc.nextInt();
		Product prodarr[]=new Product[size];
		
		for(int i=0;i<prodarr.length;i++)
		{
			System.out.println("Enter Product Id:");
			int prodId=sc.nextInt();
			System.out.println("Enter Product Name");
			String prodName=sc.next();
			System.out.println("Enter product price");
			double prodPrice=sc.nextDouble();
			System.out.println("Enter product Qty");
			int prodQty=sc.nextInt();
			Product prod=new Product(prodId,prodName,prodPrice,prodQty);
			prodarr[i]=prod;
		}
		Customer cust=new Customer(custId, cname, custMob, addr, prodarr);
		return cust;
	}
	public void display(Customer cust,Bill billobj)
	{
		System.out.println("----------Customer Datails------------");
		System.out.println("Customer Id\t\t:"+cust.getCustId());
		System.out.println("Customer Name\t\t:"+cust.getCname());
		System.out.println("Customer Mobile No\t\t:"+cust.getCustMob());
		System.out.println("----------Address Datails------------");
		System.out.println(" City"+cust.getAddr().getCity());
		System.out.println("State"+cust.getAddr().getState());
		System.out.println("Pincode"+cust.getAddr().getPrinCode());
		Product prodarr[]=cust.getProd();
		for(int i=0;i<prodarr.length;i++)
		{
			System.out.println("-------------------------------------------");
			System.out.println("product id\t\t:"+prodarr[i].getProdId());
			System.out.println("Product name\t\t:"+prodarr[i].getProdName());
			System.out.println("product price\t\t:"+prodarr[i].getProdPrice());
			System.out.println("Product Qty\t\t:"+prodarr[i].getProdQty());
		}
		System.out.println("-------------------------- Billl-------------------");
		System.out.println("Bill no"+billobj.getBillNo());
		System.out.println("Bill Date"+billobj.getDateobj());
		System.out.println("Total bill"+billobj.getTotal());
		System.out.println("cgst"+billobj.getCgst());
		System.out.println("Sgst"+billobj.getSgst());
		System.out.println("Final Total:"+billobj.getFinaltotal());
		System.out.println(" ----------Thank u visit again------------------------");
		
	}
	public Bill calculateBill(Customer cust)
	{
		Product prodarr[]=cust.getProd();
		double total=0,cgst,sgst,finaltotal;
		for(int i=0;i<prodarr.length;i++)
		{
			total=total+prodarr[i].getProdPrice()*prodarr[i].getProdQty();
			
		}
		cgst=total*0.06;
		sgst=total*0.06;
		finaltotal=total+cgst+sgst;
		Date dateobj=new Date();
		
		Bill billobj=new Bill(111, total, finaltotal, dateobj, cgst, sgst);
		return billobj;
	}

}
