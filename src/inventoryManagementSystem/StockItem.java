package inventoryManagementSystem;

import static java.lang.System.out;

public class StockItem {
	String itemID;
	String name;
	int quantity;
	
	public void display() {
		out.print(itemID + " | " + quantity + " " + name);
	}

}
