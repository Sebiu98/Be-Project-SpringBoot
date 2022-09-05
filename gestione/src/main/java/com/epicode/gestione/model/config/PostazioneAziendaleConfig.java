package com.epicode.gestione.model.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epicode.gestione.model.PostazioneAziendale;
import com.epicode.gestione.model.Tipo;



@Configuration
public class PostazioneAziendaleConfig {


    @Bean
	public PostazioneAziendale  newpostazioneAziendale() {
		


		PostazioneAziendale p1 = new PostazioneAziendale();
		p1.setDescrizione("Salone con postazioni da ufficio");
		p1.setTipo(Tipo.OPENSPACE);
		p1.setNumeroOccupati(null);
		p1.setEdificio(null);



		
		return p1;
	}
	
	
	


}
