package com.book2.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book2.VO.Book;

public interface bookDAO extends JpaRepository<Book,Integer> {

}
