package com.vaibhav;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MultiController {
	@RequestMapping("/multi")
	public ModelAndView Multiply( @RequestParam("t1") int i , @RequestParam("t2") int j )
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("multiply.jsp");
		try {
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		int k =i*j;
		mv.addObject("multiply_result",k);}
		catch (Exception ex)
		{
			mv.addObject("multiply_result","There is error \n"+ex.getMessage());}
		
		return mv;
	}

}
