package javaoperations;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Item> items = new ArrayList<>();
	
	public void setItems(ArrayList<Item> items) {
		this.items=items;
	}
	public ArrayList<Item> getItems(){
		return items;
	}
	public void addItem(Item item) {
		items.add(item);
		System.out.println(item.getTitle() + " " + "has been added.");
	}
	public void removeItem(Item item) {
		items.remove(item);
		System.out.println(item.getTitle() + " has been removed.");
	}
	public Library() {
		
	}
	
	public static void main(String[] args) {
		Library library = new Library();
		Book book = new Book("Java Programming", "John");
		DVD dvd = new DVD("The Matrix", "Leena");
		library.addItem(book);
		library.addItem(dvd);
		library.removeItem(dvd);
		
	}

}
