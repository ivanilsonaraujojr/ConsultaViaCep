package br.com.ivanilsonjr.service;

import org.springframework.http.ResponseEntity;

import br.com.ivanilsonjr.controller.dto.ConsultaDto;

public interface ViaCepService {

	ResponseEntity<ConsultaDto> consultarCep(String cep);
}
