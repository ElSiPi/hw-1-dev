package assignment;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Get a box for the Christmas gift you bought.");
		System.out.println("------------------------");
		
		Box smallBlueBox = new Box("Small", "Blue", 64, 5.45);
		Box largeRedBox = new Box("Large", "Red", 1000, 7.99);
		Box smallGoldBox = new Box("Small", "Gold", 27, 4.99);
		Box largeSilverBox = new Box("Large", "Silver", 729, 7.49);
		
		List<Box> availableBoxes = new ArrayList<Box>();
		availableBoxes.add(largeSilverBox);
		availableBoxes.add(largeRedBox);
		availableBoxes.add(smallBlueBox);
		availableBoxes.add(smallGoldBox);
		
		Item perfume = new Item("Perfume", 24);
		Item book = new Item("Book", 345);
		Item tea = new Item("Tea", 750);
		
		List<Item> purchasedItems  = new ArrayList<Item>();
		purchasedItems.add(perfume);
		purchasedItems.add(book);
		purchasedItems.add(tea);
		
		
			for (Item item : purchasedItems) {
				for (Box box : availableBoxes) {
			if(box.compareVolumes(item.getVolume())) {
				System.out.println(item.getName() +" can fit into "+ box.toString());
				System.out.println("------------------------");
			}
			
			}
		}

	}

}
