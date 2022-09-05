package com.epicode.gestione.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestione.model.Edificio;

@Configuration
public class EdificioConfig {
	
	@Bean
	public Edificio newedificio() {
		Edificio e1 = new Edificio();
		
		e1.setName("Epicode Tower");
		e1.setCity("Rome");
		e1.setIndirizzo("via Epicode, 4");
		
		return e1;
	}

}
