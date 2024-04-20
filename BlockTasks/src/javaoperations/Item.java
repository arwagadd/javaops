package javaoperations;

public class Item {
	private String title;
	private String itemType;
	
	public void setTitle(String t) {
		this.title = t;
	}
	public String getTitle() {
		return this.title;
	}
	public void setType(String t) {
		this.itemType = t;
	}
	public Item(String title, String itemType) {
		this.title = title;
		this.itemType = itemType;
	}
	

}
