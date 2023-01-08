package com.icm.IcmPortal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.icm.IcmPortal.models.Usuario;
import com.icm.IcmPortal.repositories.UsuarioDAO;


@Controller
public class LoginController {
	
	//Access
	@Autowired
	private UsuarioDAO usuarioQuery;

	//Principal
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String index() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String formLogin(@RequestParam String email, @RequestParam String password, RedirectAttributes redirAttrs) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		Usuario user = usuarioQuery.findByEmail(email);
		String EncodedPassword = user.getPassword();
		
		Boolean CheckPassword = passwordEncoder.matches(password, EncodedPassword);
		
		
		if(CheckPassword == true) {
			redirAttrs.addFlashAttribute("message", "Succesful Login!");
			return "redirect:/cadastroMembro";
		}		
		else {
			redirAttrs.addFlashAttribute("message", "Your email or Password are incorrect!");
			return "redirect:/login";
		}
		
	}
}
