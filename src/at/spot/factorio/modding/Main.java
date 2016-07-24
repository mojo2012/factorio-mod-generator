package at.spot.factorio.modding;

import at.spot.factorio.modding.definition.ModProject;
import at.spot.factorio.modding.item.Item;

public class Main {
	ModProject mod;
	
	public Main() {
		mod = new ModProject();
	}
	
	
	protected  void addItems() {
		Item testItem1 = new Item();
		mod.getItems().add(testItem1);
		
		testItem1.setName("test-item");
		
		
	}

	/**
	 * Generates mod in the dist folder.
	 */
	public void generateMod() {

	}

	public static void main(String... args ) {
		Main main = new Main();
		
		main.addItems();
		
		main.generateMod();
	}

}
