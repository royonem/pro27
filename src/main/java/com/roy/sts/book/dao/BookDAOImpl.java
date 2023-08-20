package com.roy.sts.book.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.roy.sts.book.vo.BookVO;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List selectAllBookList() throws DataAccessException {
		List<BookVO> bookList = null;
		bookList = sqlSession.selectList("mapper.book.selectAllBookList");
		return bookList;
	}

	@Override
	public int insertBook(BookVO bookVO) throws DataAccessException {
		int result = sqlSession.insert("mapper.book.insertBook", bookVO);
		return result;
	}

	@Override
	public int deleteBook(String num) throws DataAccessException {
		int result = sqlSession.delete("mapper.book.deleteBook", num);
		return result;
	}
}
