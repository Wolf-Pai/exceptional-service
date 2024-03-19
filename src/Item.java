public class Item {
	String name;
	int cost;

	public Item(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "| Item Name: " + this.name + "\n| | Cost: " + this.cost + "\n";
	}
}
