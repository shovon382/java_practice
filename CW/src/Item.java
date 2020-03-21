
public class Item {

	protected String itemid;
	private String name;
	private double price;
	private Rahim rahim;
	private Agora agora;

	public Item(String itemid, String name, double price, Agora agora, Rahim rahim) {
		this.itemid = itemid;
		this.name = name;
		this.price = price;
		this.agora = agora;
		this.rahim = rahim;
	}

	public void display() {
		agora.display();
		rahim.display();
		System.out.println("Item id: " + itemid);
		System.out.println("Item name: " + name);
		System.out.println("Item price: " + price);

	}

}