/*
 * author : Shafir Frazier
 * 
 */

import java.io.Serializable;

public class Book implements Serializable {
	
	//Attributes
	private String title;
	private String author;
	private long isbn;
	private double price;
	private boolean isBorrowed;
	
	//Constructor
	Book(String title, String author, long isbn, double price, boolean isBorrowed){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
		this.isBorrowed = isBorrowed;
	}
	
	
	//Getters & Setters for Object Attributes
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", price=" + price + ", isBorrowed="
				+ isBorrowed + "]";
	}
	
	

}
