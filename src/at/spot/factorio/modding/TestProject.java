package at.spot.factorio.modding;

import at.spot.factorio.modding.definition.ModProject;
import at.spot.factorio.modding.item.Item;
import at.spot.factorio.modding.item.ItemType;
import at.spot.factorio.modding.recipe.Group;

public class TestProject extends ModProject {

	@Override
	public void addItems() {
		Item testItem1 = new Item();
		getItems().add(testItem1);

		testItem1.setName("test-item");
		testItem1.setType(ItemType.Item);
		testItem1.setOrder("abc");
		testItem1.setStackSize(100);
		testItem1.setGroup(new Group("test-group"));
		
	}

	@Override
	public void addTiles() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEnties() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addRecipes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTechnologies() {
		// TODO Auto-generated method stub

	}

	public static void main(String... args) {
		TestProject testProject = new TestProject();
		
		testProject.addItems();
//		args[0]
		testProject.generateMod( "/dist");
	}

}
