package inventoryManagementSystem;

import static java.lang.System.out;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		GenerateInventory standard = new GenerateInventory();
		
		out.println("Welcome to the Inventory Management System");
		
		standard.generateStaticInventory();
		
		
	}

}
