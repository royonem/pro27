package com.roy.sts.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.roy.sts.book.dao.BookDAO;
import com.roy.sts.book.vo.BookVO;


@Service("bookService")
@Transactional(propagation = Propagation.REQUIRED)
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO bookDAO;

	@Override
	public List listBooks() throws DataAccessException {
		List bookList = null;
		bookList = bookDAO.selectAllBookList();
		return bookList;
	}
	
	@Override
//	public BookVO getBookDetails(int num) throws DataAccessException {
	public BookVO getBookDetails(int num) throws DataAccessException {

		return bookDAO.getBook(num);
	}

	@Override
	public int addBook(BookVO book) throws DataAccessException {
		return bookDAO.insertBook(book);
	}

	@Override
	public int removeBook(String num) throws DataAccessException {
		return bookDAO.deleteBook(num);
	}
}
