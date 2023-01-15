package com.icm.IcmPortal.controllers;

import com.icm.IcmPortal.models.Igreja;
import com.icm.IcmPortal.repositories.IgrejaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icm.IcmPortal.models.Membro;
import com.icm.IcmPortal.repositories.MembroDAO;

import java.util.List;


@Controller
public class MembroCadastroController {
	
	//Access
	@Autowired
	private MembroDAO mb;

	@Autowired
	private IgrejaDAO ig;

	@RequestMapping(value="/cadastroMembro", method=RequestMethod.GET)
    public String form(Model model) {

		List<Igreja> igj = (List<Igreja>) ig.findAll();
		model.addAttribute("igrejas", igj);
    	
    	return "cadastrarMembro";
    }
	
	
	@RequestMapping(value="/cadastroMembro", method=RequestMethod.POST)
    public String form(Membro membro) {
    	
    	mb.save(membro);
    	
    	return "redirect:/";
    }
	
	
	
}
