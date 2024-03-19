import java.util.ArrayList;

public class Store {
	String name;
	ArrayList<Item> stock = new ArrayList<Item>();
	ArrayList<Item> inventory = new ArrayList<Item>();

	public Store(String name, ArrayList<Item> stock) {
		this.name = name;
		this.stock = stock;
		this.inventory = stock;
	}

	private void restockInventory() {
		this.inventory = this.stock;
	}

	public String inventoryToString() {
		String inventoryString = "";
		for(int i = 0; i < this.inventory.size(); i++) {
			inventoryString += this.inventory.get(i).toString();
		}
		return inventoryString;
	}

	@Override
	public String toString() {
		return "\n###\nStore Name: " + this.name + "\n" + inventoryToString();
	}
}
