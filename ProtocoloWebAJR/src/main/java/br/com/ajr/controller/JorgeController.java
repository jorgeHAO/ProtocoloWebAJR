package br.com.ajr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JorgeController {

	@GetMapping(value = "/rs")
	public ModelAndView iniciar() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("var", "Jorge henrique");
		return mv;
	}
}