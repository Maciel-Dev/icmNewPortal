package com.icm.IcmPortal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icm.IcmPortal.models.Usuario;
import com.icm.IcmPortal.repositories.UsuarioDAO;


@Controller
public class RegisterController {
	
	//Access
	@Autowired
	private UsuarioDAO usuarioQuery;

	//Principal
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String index() {
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String formLogin(@RequestParam String nome, @RequestParam String email, @RequestParam String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String pEncoded = passwordEncoder.encode(password);
		
		Usuario user = new Usuario();
		user.setNome(nome);
		user.setEmail(email);
		user.setPassword(pEncoded);
		
		usuarioQuery.save(user);
		
		return "redirect:/";
	}
}
