package br.com.ivanilsonjr.model;


import javax.validation.constraints.Size;

public class Cep {

	@Size(min=8, max=10, message="CEP inválido")
	private String codigo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
