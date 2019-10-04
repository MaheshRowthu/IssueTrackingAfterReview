package com.virt.library.dao;

import java.util.Collections;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.virt.library.Book;

public class BookDaoImpl implements BookDao {
	static HashMap<Integer, Book> booksMap = new HashMap<>();
	static {
		Book b = new Book(101, "Java Programming", " Mahesh", 400);
		booksMap.put(101, b);
		b = new Book(102, "DBMS", "Soundarya", 400);
		booksMap.put(102, b);
		b = new Book(103, "Devops", "Rajesh", 400);
		booksMap.put(103, b);
		b = new Book(104, "Spring", "Manu", 400);
		booksMap.put(104, b);
		b = new Book(105, "Hibernate", "Supriya", 400);
		booksMap.put(105, b);
		b = new Book(106, "JPA", "Mouni", 400);
		booksMap.put(106, b);
	}

	public Book findById(int bid) {
		return booksMap.get(bid);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return booksMap.put(book.getBookId(), book);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		int maxKey = Collections.max(booksMap.keySet());
		return booksMap.put(maxKey + 1, book);
	}

	@Override
	public Book deleteBook(Book book) {
		// TODO Auto-generated method stub
		return booksMap.remove(book.getBookId());

	}

	public HashMap<Integer, Book> getbooksMap() {
		// TODO Auto-generated method stub
		return null;
	}
}
	