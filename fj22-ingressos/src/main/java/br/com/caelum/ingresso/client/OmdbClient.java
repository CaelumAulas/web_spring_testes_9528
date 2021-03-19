package br.com.caelum.ingresso.client;


import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import br.com.caelum.ingresso.model.Filme;

@Component
public class OmdbClient {

	public <T> Optional<T> request(Filme filme, Class<T> tClass) {
		
		String url = "https://omdb-fj22.herokuapp.com/movie?title=" + filme.getNome();
		
		RestTemplate template = new RestTemplate();
		
		try {
			
			return Optional.ofNullable(template.getForObject(url, tClass));
			
		} catch (RestClientException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return Optional.empty();
		}
	}
	
}
