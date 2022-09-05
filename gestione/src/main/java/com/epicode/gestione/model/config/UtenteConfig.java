package com.epicode.gestione.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestione.model.Utente;

@Configuration
public class UtenteConfig {
	
	@Bean
	public Utente newUtente() {
		Utente u1 = new Utente();
		u1.setName("Massimo");
		u1.setSurname("Rossi");
		u1.setMail("Massimo.Rossi@gmail.com");
		
		return u1;
		
		
	}
	

}
