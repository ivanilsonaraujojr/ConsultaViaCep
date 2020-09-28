package br.com.ivanilsonjr.model;

public class Consulta {

	private String cep;
	private String logradouro;
	private String bairro;
	private String localidade;
	private String uf;
	private boolean erro;

	public Consulta() {
		
	}

	public Consulta(String cep, String logradouro, String bairro, String localidade, String uf, boolean erro) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.erro = erro;
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

	public boolean isErro() {
		return erro;
	}
	
}
