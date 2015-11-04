																																																																																																																																																																																																package inventoryManagementSystem;

import static java.lang.System.out;

public class InventoryManagementSystem {

	public static void main(String[] args) {
		GenerateInventory standard = new GenerateInventory();
		
		out.println("Welcome to the Inventory Management System");
		
		standard.generateStaticInventory();
		
		/*Here I want to call the display methods for the StockItem instances:
		  	wateringCanItem, mankiniGnomeItem, wheelbarrowItem
		  to display the instance details on the console.
		  They have been initialised inside standard.GenerateInventory()
		  I have tried changing the generateStaticInventory method in GenerateInventory
		  to a StockItem type to return the instances but that produced errors.
		  Will I be unable to use these instances outside of GenerateInventory 
		  because they have been initialised inside of it?
		 */
	}

}
