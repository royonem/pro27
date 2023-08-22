package com.roy.sts.book.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import com.roy.sts.book.vo.BookVO;

@Repository("bookDAO")
@Aspect
public class BookDAOImpl implements BookDAO {
    private static final Logger logger = LogManager.getLogger(BookDAOImpl.class);
//    private static final Logger logger2 = (Logger) LoggerFactory.getLogger(BookDAOImpl.class);

	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BookVO> selectAllBookList() throws DataAccessException { // Why does this one work with List but not getBook?
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
	    logger.debug("num " + num);
        logger.info("num " + num);
        logger.error("num " + num);
	    bookView = sqlSession.selectOne("mapper.book.selectBook", num);
        
	    return bookView;
	}
	
	@Override
	public int editBook(BookVO bookVO) throws DataAccessException {
		int result = sqlSession.update("mapper.book.updateBook", bookVO);
		return result;
	}

	@Override
	public int deleteBook(int num) throws DataAccessException {
	    logger.debug("num " + num);
        logger.info("num " + num);
        logger.error("num " + num);
		int result = sqlSession.delete("mapper.book.deleteBook", num);
		return result;
	}
}
