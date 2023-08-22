package com.roy.sts.book.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.roy.sts.book.vo.BookVO;


public interface BookService {
	 public List<BookVO> listBooks() throws DataAccessException;
	 public int addBook(BookVO bookVO) throws DataAccessException;
	 public int removeBook(int num) throws DataAccessException;
	 public BookVO getBookDetails(int num) throws DataAccessException;
	 public int editBook(BookVO book) throws DataAccessException;
}
