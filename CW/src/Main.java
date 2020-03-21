
public class Main {

	public static void main(String[] args) {
		Rahim rahim = new Rahim("rahi@gmail.com", "0123456789", "123");
		Agora agora = new Agora("Dhaka", "997123456789", "support@agora.com");
		Item item = new Item("17", "Phone", 250.00, agora, rahim);
		item.display();
	}

}
