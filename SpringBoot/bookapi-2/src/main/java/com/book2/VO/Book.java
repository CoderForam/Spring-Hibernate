package com.book2.VO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="demoTable")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String BookName;
	private String AuthorName;
	
	 @OneToMany(cascade = {CascadeType.ALL})
     @JoinColumn(name="id", unique= true, nullable=true, insertable=true, updatable=true)
	private List<Publications> publications;
	
	
	
	
	
	public Book(int id, String bookName, String authorName, List<Publications> publications) {
		super();
		this.id = id;
		BookName = bookName;
		AuthorName = authorName;
		this.publications = publications;
	}
	public List<Publications> getPublications() {
		return publications;
	}
	public void setPublications(List<Publications> publications) {
		this.publications = publications;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public Book(int id, String bookName, String authorName) {
		super();
		this.id = id;
		BookName = bookName;
		AuthorName = authorName;
		
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", BookName=" + BookName + ", AuthorName=" + AuthorName + ", publications="
				+ publications + ", getPublications()=" + getPublications() + ", getId()=" + getId()
				+ ", getBookName()=" + getBookName() + ", getAuthorName()=" + getAuthorName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
