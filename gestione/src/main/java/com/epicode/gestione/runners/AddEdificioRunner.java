package com.epicode.gestione.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.epicode.gestione.model.Edificio;
import com.epicode.gestione.services.EdificioService;

@Component
@Order(2)
public class AddEdificioRunner implements ApplicationRunner {
  
	

	@Autowired
	private EdificioService edificioservice;
	
	@Autowired
	Edificio e1;
	
	
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		edificioservice.addEdificio(e1);
	}

}
