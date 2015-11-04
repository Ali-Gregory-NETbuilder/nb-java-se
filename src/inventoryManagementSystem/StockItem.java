package inventoryManagementSystem;

import static java.lang.System.out;

public class StockItem {
	String itemID;
	String name;
	int quantity;
	
	public void display() {
		//Prints basic information to the console
		out.println(itemID + " | " + quantity + " " + name);
	}

}
