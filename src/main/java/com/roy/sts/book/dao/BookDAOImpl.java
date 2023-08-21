package com.roy.sts.book.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import com.roy.sts.book.vo.BookVO;

@Repository("bookDAO")
@Aspect
public class BookDAOImpl implements BookDAO {
    private static final Logger logger = LogManager.getLogger(BookDAOImpl.class);
//    private static final Logger logger2 = (Logger) LoggerFactory.getLogger(BookDAOImpl.class);

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BookVO> selectAllBookList() throws DataAccessException {
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
	public BookVO getBook(int num) throws DataAccessException {
		BookVO bookView = null;
//	    Map<String, Object> paramMap = new HashMap<String, Object>();
//	    paramMap.put("num", num);
//	    bookView = sqlSession.selectList("mapper.book.selectBook", paramMap);
	    logger.debug("num " + num);
        logger.info("num " + num);
        logger.error("num " + num);
	    bookView = sqlSession.selectOne("mapper.book.selectBook", num);
        
	    return bookView;
	}

	@Override
	public int deleteBook(String num) throws DataAccessException {
		int result = sqlSession.delete("mapper.book.deleteBook", num);
		return result;
	}
}
