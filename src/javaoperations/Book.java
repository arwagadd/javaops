package javaoperations;

public class Book extends Item {
	
	public Book(String title, String author) {
		super(title, "Book");
		this.author = author;
	}
	private String author;
	
	public void setAuthor(String a) {
		this.author = a;
	}
	public String getAuthor() {
		return this.author;
	}
	
}
