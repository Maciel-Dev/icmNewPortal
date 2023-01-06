package com.icm.IcmPortal.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
	
	@Bean
	public UserDetailsService user() {
		UserBuilder users = User.withDefaultPasswordEncoder();
		UserDetails user = users.username("teste").password("123").roles("USER").build();
		UserDetails admin = users.username("admin").roles("USER", "ADMIN").build();
		return new InMemoryUserDetailsManager(user, admin);
	}
}
