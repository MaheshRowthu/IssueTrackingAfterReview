package com.virt.library.dao;

import com.virt.library.Book;

public interface BookDao {
	Book findById(int bid);

	Book updateBook(Book book);

	Book addBook(Book book);

	Book deleteBook(Book book);
}
