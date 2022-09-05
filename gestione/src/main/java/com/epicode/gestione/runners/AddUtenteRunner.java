package com.epicode.gestione.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.epicode.gestione.model.Utente;
import com.epicode.gestione.services.UtenteService;

@Component
public class AddUtenteRunner implements ApplicationRunner {

	@Autowired
	private UtenteService utenteService;
	
	@Autowired
	Utente u1;
	
	
	
	
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		utenteService.addUtente(u1);
	

	}

}
