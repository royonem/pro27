package com.roy.sts.book.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.roy.sts.book.service.BookService;
import com.roy.sts.book.vo.BookVO;

@Controller("bookController")
public class BookControllerImpl implements BookController {

	@Autowired
	private BookService bookService;

	@Autowired
	private BookVO bookVO;

	@Override
	@RequestMapping(value = "/book/listBooks.shinoo", method = RequestMethod.GET)
	public ModelAndView listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		List<BookVO> bookList = bookService.listBooks();
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("bookList", bookList);
		return mav;
	}

	@Override
	@RequestMapping(value = "/book/addBook.do", method = RequestMethod.POST)
	public ModelAndView addBook(@ModelAttribute("book") BookVO book, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		int result = 0;
		result = bookService.addBook(book);
		ModelAndView mav = new ModelAndView("redirect:/book/listBooks.shinoo");
		return mav;
	}

	@Override
	@RequestMapping(value = "/book/viewBook.do", method = RequestMethod.GET)
	public ModelAndView viewBook(@RequestParam("num") int num, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		BookVO bookDetails = bookService.getBookDetails(num);
		ModelAndView mav = new ModelAndView(viewName);
			
	    mav.addObject("bookDetails", bookDetails);  // Add book details list object

		return mav;
	}

	@Override
	@RequestMapping(value = "/book/removeBook.do", method = RequestMethod.GET)
	public ModelAndView removeBook(@RequestParam("num") int num, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		bookService.removeBook(num);
		ModelAndView mav = new ModelAndView("redirect:/book/listBooks.shinoo");
		return mav;
	}
	
	@Override
	@RequestMapping(value = "/book/editBook.do", method = RequestMethod.POST)
	public ModelAndView editBook(@ModelAttribute("book") BookVO book, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		bookService.editBook(book);
		ModelAndView mav = new ModelAndView("redirect:/book/viewBook.do?num="+book.getNum());
//		ModelAndView mav = new ModelAndView("redirect:/book/listBooks.shinoo");
		return mav;
	}

	/*
	 * @RequestMapping(value = { "/book/loginForm.do", "/book/bookForm.do" },
	 * method = RequestMethod.GET)
	 */
	@RequestMapping(value = "/book/bookForm.do", method = RequestMethod.GET)
	public ModelAndView bookForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		return mav;
	}
	
	@RequestMapping(value = "/book/editForm.do", method = RequestMethod.GET)
	public ModelAndView editForm(@RequestParam("num") int num, HttpServletRequest request, HttpServletResponse response) throws Exception {
		String viewName = getViewName(request);
		ModelAndView mav = new ModelAndView(viewName);

		BookVO bookDetails = bookService.getBookDetails(num);
			
	    mav.addObject("bookDetails", bookDetails);
		
		return mav;
	}


	private String getViewName(HttpServletRequest request) throws Exception {
		String contextPath = request.getContextPath();
		String uri = (String) request.getAttribute("javax.servlet.include.request_uri");
		if (uri == null || uri.trim().equals("")) {
			uri = request.getRequestURI();
		}

		int begin = 0;
		if (!((contextPath == null) || ("".equals(contextPath)))) {
			begin = contextPath.length();
		}

		int end;
		if (uri.indexOf(";") != -1) {
			end = uri.indexOf(";");
		} else if (uri.indexOf("?") != -1) {
			end = uri.indexOf("?");
		} else {
			end = uri.length();
		}

		String viewName = uri.substring(begin, end);
		if (viewName.indexOf(".") != -1) {
			viewName = viewName.substring(0, viewName.lastIndexOf("."));
		}
		if (viewName.lastIndexOf("/") != -1) {
			viewName = viewName.substring(viewName.lastIndexOf("/"), viewName.length());
		}
		return viewName;
	}

}
