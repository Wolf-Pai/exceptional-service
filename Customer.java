import java.util.ArrayList;

public class Customer {
	String name;
	int funds;
	ArrayList<Item> cart = new ArrayList<Item>();

	public Customer(String name) {
		this.name = name;
		this.funds = 0;
	}

	public void changeName(String name) {
		this.name = name;
	}

	public void inputFunds(int fund) {
		this.funds += fund;
	}

	public void purchaseItem(Store store, Item item) {
		this.cart.add(item);
	}

	public String cartToString() {
		String cartString = "Your Cart:\n";
		for(int i = 0; i < this.cart.size(); i++) {
			cartString += "Item #" + i + ": " + this.cart.get(i).toString();
		}
		return cartString;
	}

	@Override
	public String toString() {
		return "Customer Name: " + this.name + "\n| Funds: " + this.funds + "\n| " + cartToString();
	}
}
