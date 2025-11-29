package in.arunIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.arunIt.entity.Book;
import in.arunIt.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public ModelAndView getBook() {
	
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("bookObj",new Book());
		mav.setViewName("index");
		return mav;
	}
	@PostMapping("/book")
	public ModelAndView potBook(Book book) {
		
		
		ModelAndView mav = new ModelAndView();
		boolean saveBook = bookService.saveBook(book);
		
		if(saveBook) {
		mav.addObject("msg","User Book Details Saved Successfully.....!!!!!");
		}else {
			mav.addObject("mg","User Book Details Not Saved.....!!!!!");
			
		}
		mav.addObject("bookObj",new Book());
		mav.setViewName("index");
		return mav;
	}
		
		@GetMapping("/books")
		public ModelAndView viewAllBook() {
		
			List<Book> allBooks = bookService.getAllBooks();
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("bkObj", allBooks);
			mav.setViewName("success");
			return mav;
		
	}

}
