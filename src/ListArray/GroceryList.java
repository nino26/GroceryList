package ListArray;

import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> groceryList = new ArrayList<String>();
	
	
	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	//add grocery item
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	//print arraylist
	public void printGroceryList() {
		System.out.println("You have "+ groceryList.size()+ " items in your list\n");
		for (int i = 0; i < groceryList.size(); i++) {	
			System.out.println((i+1)+". "+ groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(String currentItem, String newItem) {
		int position = findItem(currentItem);
		if(position >=0) {
			modifyGroceryItem(position, newItem);
		}
		
	}
	//modefiy and array list
	private void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position+1)+ " has been modefied.");
	}
	//remove item from list
	public void removeGroceryItem(String item) {
		int position = findItem(item);
		if(position >=0) {
			removeGroceryItem(position);
		}
	}
	
	
	private void removeGroceryItem(int position) {
		groceryList.remove(position);
	}
	
	//query through the list
	private int findItem(String searchItem) {
//		boolean exist = groceryList.contains(searchItem);
		return groceryList.indexOf(searchItem);
		
	}
	
	public boolean onFile(String searchItem) {
		int position = findItem(searchItem);
		if(position >=0) {
			return true;
		}
		return false;
	}
	
	
	
}
