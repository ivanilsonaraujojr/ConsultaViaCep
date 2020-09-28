package br.com.ivanilsonjr.controller.dto;

import br.com.ivanilsonjr.model.Consulta;

public class ConsultaDto {
	private String cep;
	private String logradouro;
	private String bairro;
	private String localidade;
	private String uf;
	
	public ConsultaDto() {
		
	}
	public ConsultaDto(Consulta consulta) {
		this.cep = consulta.getCep();
		this.logradouro = consulta.getLogradouro();
		this.bairro = consulta.getBairro();
		this.localidade = consulta.getLocalidade();
		this.uf = consulta.getUf();
	}

	public String getCep() {
		return cep;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getLocalidade() {
		return localidade;
	}
	
	public String getUf() {
		return uf;
	}
}
