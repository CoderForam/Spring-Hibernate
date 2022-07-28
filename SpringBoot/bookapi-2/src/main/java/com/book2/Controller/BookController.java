package com.book2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book2.Service.bookService;
import com.book2.VO.Book;

@RestController
public class BookController {

	@Autowired
	private bookService bookservice;
	
	
	@GetMapping("/getBook")
	public List<Book> getBook()
	{
		
		return bookservice.getBook2();
		
	}
	
	
	@PostMapping("/setBook")
	public Book setBook(@RequestBody Book b)
	{
		
		Book book = bookservice.getBook(b);
		return book;
		
	}
	
	@PostMapping("UpdateBookById/{id}")
	public void setById(@RequestBody Book b,@PathVariable int id)
	{
		b.setId(id);
		bookservice.setBookById(b);
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public void deleteBook(@PathVariable int id)
	{
		bookservice.deleteBook(id);
	}
}
