/*
 * Exceptional Service!
 * Try to test a customer-service application.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionalService {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Item ike_food = new Item("Ike Food", 100);
		Item southside = new Item("Southside", 150);
		Item eggcrates = new Item("Eggcrates", 1000);
		Item human_emergence = new Item("Human Emergence", 01);
		Item piazza = new Item("Piazza", 0);

		ArrayList<Item> cs_stock = new ArrayList<Item>();
		cs_stock.add(southside);
		cs_stock.add(eggcrates);

		ArrayList<Item> see_stock = new ArrayList<Item>();
		see_stock.add(ike_food);
		see_stock.add(human_emergence);

		ArrayList<Item> yava_stock = new ArrayList<Item>();
		yava_stock.add(human_emergence);
		yava_stock.add(piazza);

		Store cs_one_ten = new Store("CS One-Ten", cs_stock);
		Store see_es_two = new Store("See-Es Two", see_stock);
		Store yava = new Store("Yava.", yava_stock);

		String confirmName = "no";
		String customerName = "";

		while(confirmName.equals("no")) {
			System.out.print("Enter your name: ");
			customerName = scan.nextLine();
			System.out.println("Is this your name: " + customerName + "? (yes/no)");
			confirmName = scan.next();
		}

		Customer customer = new Customer(customerName);

		System.out.println("Welcome, " + customerName + ", to the Online Exceptional Store!");

		System.out.println("Here are some stores:\n" + cs_one_ten.toString() + see_es_two.toString() + yava.toString());
    }
}
