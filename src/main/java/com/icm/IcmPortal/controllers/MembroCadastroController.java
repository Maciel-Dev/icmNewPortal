package com.icm.IcmPortal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icm.IcmPortal.models.Membro;
import com.icm.IcmPortal.repositories.MembroDAO;


@Controller
public class MembroCadastroController {
	
	//Access
	@Autowired
	private MembroDAO mb;

	@RequestMapping(value="/cadastroMembro", method=RequestMethod.GET)
    public String form() {
    	
    	return "cadastrarMembro";
    }
	
	
	@RequestMapping(value="/cadastroMembro", method=RequestMethod.POST)
    public String form(Membro membro) {
    	
    	mb.save(membro);
    	
    	return "redirect:/";
    }
	
	
	
}
