package com.virt.library;

public class Book {
	private String title, author;
	private int bookId, price, edition;
	private Record record;
	public Book( int bookId, String title, String author,int price) {
		super();
		this.title = title;
		this.author = author;
		this.bookId = bookId;
		this.price = price;
//		this.edition = edition;
		//Record record
	}
	public Book() {
		super();
	}
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

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookId=" + bookId + ", price=" + price + ", edition="
				+ edition + ", record=" + record + "]";
	}

}
