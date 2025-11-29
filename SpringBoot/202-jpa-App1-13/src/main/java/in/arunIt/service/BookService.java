package in.arunIt.service;

import java.util.List;

import in.arunIt.entity.Book;

public interface BookService {
	public boolean saveBook(Book b);
	
	public List<Book> getAllBooks();

}
