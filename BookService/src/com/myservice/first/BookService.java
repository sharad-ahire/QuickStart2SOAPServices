package com.myservice.first;

public class BookService {

	public Book[] getBooks() {
		System.out.println("Entering getBooks");
		Book book1 = new Book();
		book1.setTitle("Core Java");
		return new Book[] { book1 };
	}

	public Book findBook(String isbn) {
		System.out.println("Finding book for iSBN:"+isbn);
		Book book1 = new Book();
		book1.setTitle("SOAP WebServices");
		return book1;
	}
	
	public Book addBook(Book book) {
		return null;
	}

}
