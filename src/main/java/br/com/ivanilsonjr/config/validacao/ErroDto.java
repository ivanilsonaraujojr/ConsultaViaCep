package br.com.ivanilsonjr.config.validacao;

public class ErroDto {
	private int codigoErro;
	private String erro;

	public ErroDto(int codigoErro, String erro) {
		this.codigoErro = codigoErro;
		this.erro = erro;
	}
	
	public int getCodigoErro() {
		return codigoErro;
	}
	
	public String getErro() {
		return erro;
	}
}
