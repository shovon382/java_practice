
public class Agora extends Shop {
	private String cellno, email;

	public Agora(String location, String cellno, String email) {
		super(location);
		this.cellno = cellno;
		this.email = email;
	}

	public void display() {
		super.display();
		System.out.println("Cellno: " + cellno);
		System.out.println("Email: " + email);
	}

}
