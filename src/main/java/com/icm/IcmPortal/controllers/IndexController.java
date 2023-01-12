package com.icm.IcmPortal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icm.IcmPortal.models.Membro;
import com.icm.IcmPortal.repositories.MembroDAO;


@Controller
public class IndexController {
	
	//Access
	@Autowired
	private MembroDAO mb;

	//Principal
	@GetMapping("/")
	//Questionar se o usuário possui sessão
	//Sessão True = Index HTML
	//Sessão False = Login / Register
	public String index() {
		return "redirect:login";
	}
	
	@RequestMapping(value="/cadastrarVisita", method=RequestMethod.POST)
    public String form(Membro membro) {
    	
    	mb.save(membro);

    	return "redirect:/";
    }
	
}
