package br.com.ivanilsonjr.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.ivanilsonjr.controller.dto.ConsultaDto;
import br.com.ivanilsonjr.model.Consulta;
import br.com.ivanilsonjr.service.ViaCepService;

@Service
public class ViaCepServiceImpl implements ViaCepService{

	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@Value("${viacepapi.url}/")
	private String urlWsViaCep;

	@Override
	public ResponseEntity<ConsultaDto> consultarCep(String cep){
		String urlRequest = urlWsViaCep + cep + "/json";
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", "application/json");
		HttpEntity<Consulta> entity = new HttpEntity<Consulta>(headers);
		ResponseEntity<Consulta> responseStatus = restTemplate().exchange(urlRequest, HttpMethod.GET, entity, Consulta.class);
		
		if(responseStatus.getBody().isErro() || responseStatus.getStatusCode() != HttpStatus.OK) {
			return null;
		}
		return ResponseEntity.ok(new ConsultaDto(responseStatus.getBody()));
		}
	
	}
