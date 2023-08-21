package com.roy.sts.book.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.roy.sts.book.vo.BookVO;


public interface BookController {
	public ModelAndView listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView addBook(@ModelAttribute("info") BookVO bookVO, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	public ModelAndView removeBook(@RequestParam("num") String num, HttpServletRequest request,
			HttpServletResponse response) throws Exception;
	
//	public ModelAndView viewBook(@ModelAttribute("bookView") BookVO bookView, HttpServletRequest request) throws Exception;
	
	public ModelAndView viewBook(@RequestParam("num") String num, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

}
