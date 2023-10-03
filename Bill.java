import java.util.Date;
public class Bill {
	private int billNo;
	private double total;
	private double finaltotal;
	private  Date dateobj;
	private double cgst;
	private  double sgst;
	public Bill(int billNo, double total, double finaltotal, Date dateobj, double cgst, double sgst) {
		super();
		this.billNo = billNo;
		this.total = total;
		this.finaltotal = finaltotal;
		this.dateobj = dateobj;
		this.cgst = cgst;
		this.sgst = sgst;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getFinaltotal() {
		return finaltotal;
	}
	public void setFinaltotal(double finaltotal) {
		this.finaltotal = finaltotal;
	}
	public Date getDateobj() {
		return dateobj;
	}
	public void setDateobj(Date dateobj) {
		this.dateobj = dateobj;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	

}
