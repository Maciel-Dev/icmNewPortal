package com.icm.IcmPortal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icm.IcmPortal.models.Membro;
import com.icm.IcmPortal.repositories.MembroDAO;



@Controller
public class MembroListagemController {
	
	//Access
	@Autowired
	private MembroDAO mb;

	//Principal
	@RequestMapping(value="/listaMembros", method=RequestMethod.GET)
    public String form(Model model) {
    	
		List<Membro> mbm = (List<Membro>) mb.findAll();
		model.addAttribute("membros", mbm);
    	
    	return "listagemMembros";
    }
	
}
