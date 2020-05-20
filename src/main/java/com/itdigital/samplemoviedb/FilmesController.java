package com.itdigital.samplemoviedb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FilmesController {

	@Autowired
	private RestTemplateBuilder builder;

    @GetMapping("/estreias")
	public Estreias estreias() {
		RestTemplate restTemplate = builder.build();
		
		Estreias estreias = restTemplate.getForObject(
			"https://api.themoviedb.org/3/movie/upcoming?api_key=c3ef6199d9ec6c9b7e2a2b34edcc379c", 
			Estreias.class);
		
		GeneroCollection generoColection = restTemplate.getForObject(
				"https://api.themoviedb.org/3/genre/movie/list?api_key=c3ef6199d9ec6c9b7e2a2b34edcc379c", 
				GeneroCollection.class);
		
		// // for (Filme filme : estreias.getFilmes()) {
		// // 	for (int generoId : filme.getGeneroIds()) {
		// // 		Genero genero = generoColection.getGeneros()
		// // 			.filter((g) -> g.getId() == generoId)
		// // 			.findFirst();
					  
		// // 		filme.addGenero(genero);	
		// // 	}
		// // }

		return estreias;
	}
}