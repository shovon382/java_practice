
public class Rahim extends Customer {
	private String email, cell;

	public Rahim(String email, String cell, String custid) {
		super(custid);
		this.cell = cell;
		this.email = email;
	}

	public void display() {
		super.display();
		System.out.println("Email: " + email);
		System.out.println("Cell: " + cell);
	}
}
