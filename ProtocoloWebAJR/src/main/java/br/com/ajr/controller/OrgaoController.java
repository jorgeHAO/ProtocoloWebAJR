package br.com.ajr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrgaoController {
	
	@RequestMapping("/lista")
	public ModelAndView listar(){
		return new ModelAndView("index");
	}

}
