
public abstract class Shop {
	protected String location;

	public Shop(String location) {
		this.location = location;
	}

	public void display() {
		System.out.println("Location: " + location);
	}
}
