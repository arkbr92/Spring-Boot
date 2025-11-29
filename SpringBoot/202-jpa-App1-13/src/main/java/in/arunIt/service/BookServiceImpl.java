package in.arunIt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.arunIt.entity.Book;
import in.arunIt.repo.BookRepository;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public boolean saveBook(Book b) {
		Book save = bookRepo.save(b);
		
		return save.getBookId()!=null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

}
