package com.icm.IcmPortal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icm.IcmPortal.repositories.UsuarioDAO;


@Controller
public class loginController {
	
	//Access
	@Autowired
	private UsuarioDAO usuarioQuery;

	//Principal
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String index() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String formLogin(@RequestParam String email, @RequestParam String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String pEncoded = passwordEncoder.encode(password);
		
		System.out.println(pEncoded);
		
		System.out.println(email);
		System.out.println(password);
		return "redirect:/";
	}
}
