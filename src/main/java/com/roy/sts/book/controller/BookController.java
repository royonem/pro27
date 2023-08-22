package com.roy.sts.book.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.roy.sts.book.vo.BookVO;


public interface BookController {
	public ModelAndView listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addBook(@ModelAttribute("this should not matter") BookVO bookVO, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	public ModelAndView removeBook(@RequestParam("num") int num, HttpServletRequest request,
			HttpServletResponse response) throws Exception;
		
	public ModelAndView viewBook(@RequestParam("num") int num, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	public ModelAndView editBook(@ModelAttribute("this should not matter") BookVO book, HttpServletRequest request, HttpServletResponse response) throws Exception;

}
