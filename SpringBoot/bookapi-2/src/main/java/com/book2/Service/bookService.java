package com.book2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book2.DAO.bookDAO;
import com.book2.VO.Book;

@Service
public class bookService {
	
	@Autowired
	private bookDAO bookdao;

	public Book getBook(Book b) {
		// TODO Auto-generated method stub
		
		Book save = bookdao.save(b);
		return save;
	}

	public List<Book> getBook2() {
		return bookdao.findAll();
		
	}

	public void setBookById(Book b) {
		// TODO Auto-generated method stub
		bookdao.save(b);
		
	}

	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		bookdao.deleteById(id);
		
	}
	
	

}
