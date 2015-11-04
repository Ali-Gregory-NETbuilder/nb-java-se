package inventoryManagementSystem;

import static java.lang.System.out;

public class GenerateInventory {

	public StockItem[] generateStaticInventory() {
		//Initialise 3 instances of the StockItem class
		StockItem wateringCanItem = new StockItem();
		StockItem mankiniGnomeItem = new StockItem();
		StockItem wheelbarrowItem = new StockItem();
		
		
		StockItem[] stockItemArray = {wateringCanItem, mankiniGnomeItem, wheelbarrowItem};
		
		//This message shows that GenerateInventory has been successfully called
		out.println("An inventory shall be automatically generated.");
		
		wateringCanItem.itemID = "WC0001";
		wateringCanItem.name = "Watering can";
		wateringCanItem.quantity = 9;
		
		mankiniGnomeItem.itemID = "MG0001";
		mankiniGnomeItem.name = "Mankini clad gnome";
		mankiniGnomeItem.quantity = 5;
		
		wheelbarrowItem.itemID = "WB0001";
		wheelbarrowItem.name = "Wheelbarrow";
		wheelbarrowItem.quantity = 12;
		
		return stockItemArray;
	}

}
