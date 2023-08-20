package com.roy.sts.book.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.roy.sts.book.vo.BookVO;

public interface BookDAO {
	 public List selectAllBookList() throws DataAccessException;
	 public int insertBook(BookVO bookVO) throws DataAccessException ;
	 public int deleteBook(String num) throws DataAccessException;
	 public List getBook(int num) throws DataAccessException;
	 
}
