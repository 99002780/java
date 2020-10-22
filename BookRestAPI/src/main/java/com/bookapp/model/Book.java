package com.bookapp.model;

public class Book {
 Integer bookId;
 String tittle;
 String author;
 String category;
 Double price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(Integer bookId, String tittle, String author, String category, Double price) {
	super();
	this.bookId = bookId;
	this.tittle = tittle;
	this.author = author;
	this.category = category;
	this.price = price;
}
public Integer getBookId() {
	return bookId;
}
public void setBookId(Integer bookId) {
	this.bookId = bookId;
}
public String getTittle() {
	return tittle;
}
public void setTittle(String tittle) {
	this.tittle = tittle;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", tittle=" + tittle + ", author=" + author + ", category=" + category
			+ ", price=" + price + "]";
}
 
 
}
