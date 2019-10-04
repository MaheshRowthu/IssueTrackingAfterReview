package com.virt.nain;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.virt.library.Book;
import com.virt.library.dao.BookDaoImpl;
import com.virt.service.BookService;
import com.virt.service.BookServiceImpl;

public class LibraryMain {

/*
 *agile
 *
 * We will maintain it by phases soo we can manage it as per requirement changes
 * 
 * full plan is not required
 * 
 * compare with other models it's someword compfortable to all
 * */
 
	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		Book book101=bookService.findById(101);
		System.out.println(book101);
		book101.setPrice(454);
		bookService.updateBook(book101);
		System.out.println(book101);
		bookService.deleteBook(book101);
		Book book=bookService.findById(101);
		if(book==null) {
			System.out.println("Delete Succesful");
		}
		else {
			System.out.println("Delete Unsuccesful");
		}
		BookDaoImpl dao=new BookDaoImpl();
		HashMap<Integer,Book>booksMap=dao.getbooksMap();
		Stream<Book> stream=booksMap.values().parallelStream();
		List<Book> listBooks=stream.filter(bk -> bk.getPrice() > 300)
				.collect(Collectors.toList());
		listBooks.forEach(System.out :: println);
	}
}