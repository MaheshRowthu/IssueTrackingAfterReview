package com.virt.service;

import com.virt.library.Book;
import com.virt.library.dao.BookDao;
import com.virt.library.dao.BookDaoImpl;

public class BookServiceImpl implements BookService{
	private BookDao bookDao=new BookDaoImpl();
	public Book findById(int bid) {
		return bookDao.findById(bid);
	}
	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(book);
	}
	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.addBook(book);
	}
	@Override
	public Book deleteBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(book);
	}
	@Override
	public void addBoosOfSameType(Book book, int number) {
		// TODO Auto-generated method stub
		for(int i=1;i<number;i++)
			bookDao.addBook(book);
	}
}
