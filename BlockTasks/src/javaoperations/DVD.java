package javaoperations;

public class DVD extends Item {
	
	private String director;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String d) {
		this.director = d;
	}

	public DVD(String title, String d) {
		super(title, "DVD");
		this.director = d;
	}

}
