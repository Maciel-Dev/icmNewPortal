package com.icm.IcmPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class IcmPortalApplication {
	
	@GetMapping("/teste")
	public String mensagem() {
		return "OLA, Funciona";
	}

	public static void main(String[] args) {
		SpringApplication.run(IcmPortalApplication.class, args);
	}

}
