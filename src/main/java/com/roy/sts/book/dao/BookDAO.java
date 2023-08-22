package com.roy.sts.book.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.roy.sts.book.vo.BookVO;

public interface BookDAO {
	 public List<BookVO> selectAllBookList() throws DataAccessException;
	 public int insertBook(BookVO bookVO) throws DataAccessException ;
	 public int deleteBook(int num) throws DataAccessException;
	 public BookVO getBook(int num) throws DataAccessException;
	 public int editBook(BookVO bookVO) throws DataAccessException;
}
