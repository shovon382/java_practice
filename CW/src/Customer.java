
public abstract class Customer {
	protected String custid;

	public Customer(String custid) {
		this.custid = custid;
	}

	public void display() {
		System.out.println("ID: " + custid);
	}
}
