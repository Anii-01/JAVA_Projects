package com.pvpit;      // pojo userdefine encapsulated  entity class

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int bookId;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private int price;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(int bookId, String name, String author, int price) {
		
		super();
		
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public Book() {
		
		}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
}
