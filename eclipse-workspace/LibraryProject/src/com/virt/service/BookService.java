package com.virt.service;

import com.virt.library.Book;

public interface BookService {
	Book findById(int bid);

	Book updateBook(Book book);

	Book addBook(Book book);

	Book deleteBook(Book book);

	void addBoosOfSameType(Book book, int number);
}
