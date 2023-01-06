package com.icm.IcmPortal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icm.IcmPortal.models.Igreja;
import com.icm.IcmPortal.models.Louvor;
import com.icm.IcmPortal.repositories.IgrejaDAO;
import com.icm.IcmPortal.repositories.LouvorDAO;


@Controller
public class ListaLouvorController {
	
	//Access
	@Autowired
	private LouvorDAO lv;
	
	@Autowired
	private IgrejaDAO ig;

	@RequestMapping(value="/listaLouvor", method=RequestMethod.GET)
    public String form(Model model) {
		
		List<Louvor> lvl = (List<Louvor>) lv.findAll();
		model.addAttribute("louvores", lvl);
		List<Igreja> igj = (List<Igreja>) ig.findAll();
		model.addAttribute("igrejas", igj);
    	
    	return "listaLouvor";
    }
	
	
	@RequestMapping(value="/listaLouvor", method=RequestMethod.POST)
    public String form(Louvor louvor) {
    	
    	lv.save(louvor);
    	
    	return "redirect:/listaLouvor";
    }
	
	@RequestMapping(value="/filterListaLouvor", method=RequestMethod.GET)
	public String filtro(@RequestParam(name = "numero") int numero, @RequestParam(name = "option") String option, Louvor louvor, Model model) {
		
		List<Louvor> lvl = (List<Louvor>) lv.findByNumero(numero);
		model.addAttribute("louvores", lvl);
				
		return "listaLouvor";
	}
	
	@RequestMapping(value="/filterNomeIgreja", method=RequestMethod.GET)
	public String filtro(@RequestParam(name = "nome") String nome, Igreja igreja, Model model) {
		
		List<Igreja> igj = (List<Igreja>) ig.findByNome(nome);
		model.addAttribute("louvores", igj);
				
		return "listaLouvor";
	}
	
}
